package com.bytedanceapi.example.poster;

import com.bytedanceapi.helper.Const;
import com.bytedanceapi.model.beans.DomainInfo;
import com.bytedanceapi.model.beans.ImgUrl;
import com.bytedanceapi.model.beans.ImgUrlOption;
import com.bytedanceapi.model.response.GetDomainWeightsResponse;
import com.bytedanceapi.service.vod.IVodService;
import com.bytedanceapi.service.vod.impl.VodServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetPosterDemo {

    public static void main(String[] args) {
        // step1: construct IVodService
        IVodService vodService = VodServiceImpl.getInstance();

        // step2: call below method if you dont set ak and sk in ～/.vcloud/config
        // vodService.setAccessKey("ak");
        // vodService.setSecretKey("sk");

        String spaceName = "your spaceName";
        String uri = "your uri";
        String sig = "your sig";

        assert vodService.getAccessKey() != null;
        assert vodService.getSecretKey() != null;

        Map<String, Integer> fallbackWeights = new HashMap<>();
        fallbackWeights.put("v1.test.com", 10);
        fallbackWeights.put("v2.test.com", 5);
        // step3: set fallback domain if necessary
        vodService.setFallbackDomainWeights(fallbackWeights);

        GetDomainWeightsResponse getDomainWeightsResponse = vodService.getDomainWeights(spaceName);
        System.out.println(getDomainWeightsResponse.getResult());

        for (int j = 0; j < 10; j++) {
            try {
                DomainInfo domainInfo = vodService.getDomainInfo(spaceName);
                System.out.println(domainInfo);
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        // get poster img url
        ImgUrlOption imgUrlOption = new ImgUrlOption();
        imgUrlOption.setHttps(true);
        imgUrlOption.setVodTplSmartCrop(600, 392);
        imgUrlOption.setFomat(Const.FORMAT_AWEBP);


        ImgUrl imgUrl = vodService.getPosterUrl(spaceName, uri, imgUrlOption);
        System.out.println(imgUrl.getMainUrl());
        System.out.println(imgUrl.getBackupUrl());

        // get other image url
        imgUrlOption = new ImgUrlOption();
        Map<String, List<String>> kv = new HashMap<String, List<String>>();
        List<String> list = new ArrayList<>();
        list.add("my测试");
        kv.put("from", list);

        imgUrlOption.setKv(kv);
        imgUrlOption.setFomat(Const.FORMAT_AWEBP);
        imgUrlOption.setHttps(true);
        imgUrlOption.setTpl(Const.VOD_TPL_SIG);
        imgUrlOption.setSigKey(sig);

        imgUrl = vodService.getImageUrl(spaceName, uri, imgUrlOption);
        System.out.println(imgUrl.getMainUrl());
        System.out.println(imgUrl.getBackupUrl());

        // step4: notice, shutdown the vodService if no use any more, otherwise the process would not exit
        vodService.shutdown();
    }
}