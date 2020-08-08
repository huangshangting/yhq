package test.java.com.najia.quan;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.TbkDgMaterialOptionalRequest;
import com.taobao.api.request.TbkDgOptimusMaterialRequest;
import com.taobao.api.response.TbkDgMaterialOptionalResponse;
import com.taobao.api.response.TbkDgOptimusMaterialResponse;

public class MyTest {

    private static final String TAOBAO_URL = "http://gw.api.taobao.com/router/rest";

    private static final String APP_KEY = "30139857";

    private static final String APP_SECRET = "c08ccb3ff49a222149b3f1876f25cad0";

    private static final long  ADZONEID = 110495600319L;

    private static final String SERCH  = "https://detail.tmall.com/item.htm?id=605735757618";

    public static void main(String[] args) {
//        sousuo();
        String ad = "588315875078.htm?price=98&sourceType=item&sourceType=item&suid=149d3069-3067-4eb9-ba3e-3b97fff31838&shareUniqueId=1551338078&ut_sk=1.XprwWKZzFHYDAA5dpktdWyr7_21646297_1593870126624.Copy.1&un=a819d4f3e950cce13911dc70f8aca8ac&share_crt_v=1&spm=a2159r.13376460.0.0&sp_tk=JDJLWHgxeDVXaWhLJA==";
        String[] ffs = ad.split("/.");
        System.out.println(ffs.length);
        System.out.println(ad.substring(0, 30));
    }

    private static void sousuo() {
        TaobaoClient client = new DefaultTaobaoClient(TAOBAO_URL, APP_KEY, APP_SECRET);
        TbkDgMaterialOptionalRequest req = new TbkDgMaterialOptionalRequest();
//        req.setStartDsr(10L);
//        req.setPageSize(20L);
//        req.setPageNo(1L);
//        req.setPlatform(1L);
//        req.setEndTkRate(1234L);
//        req.setStartTkRate(1234L);
//        req.setEndPrice(10L);
//        req.setStartPrice(10L);
//        req.setIsOverseas(false);
//        req.setIsTmall(false);
//        req.setSort("tk_rate_des");
//        req.setItemloc("杭州");
//        req.setCat("16,18");
        req.setQ(SERCH);
//        req.setMaterialId(2836L);
        req.setHasCoupon(true);
//        req.setIp("13.2.33.4");
        req.setAdzoneId(ADZONEID);
//        req.setNeedFreeShipment(true);
//        req.setNeedPrepay(true);
//        req.setIncludePayRate30(true);
//        req.setIncludeGoodRate(true);
//        req.setIncludeRfdRate(true);
//        req.setNpxLevel(2L);
//        req.setEndKaTkRate(1234L);
//        req.setStartKaTkRate(1234L);
//        req.setDeviceEncrypt("MD5");
//        req.setDeviceValue("xxx");
//        req.setDeviceType("IMEI");
//        req.setLockRateEndTime(1567440000000L);
//        req.setLockRateStartTime(1567440000000L);
//        req.setLongitude("121.473701");
//        req.setLatitude("31.230370");
//        req.setCityCode("310000");
//        req.setSellerIds("1,2,3,4");
        TbkDgMaterialOptionalResponse rsp = null;
        try {
            rsp = client.execute(req);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        System.out.println(rsp.getBody());
    }

    private static void jingxuan() {
        TaobaoClient client = new DefaultTaobaoClient(TAOBAO_URL, APP_KEY, APP_SECRET);
        TbkDgOptimusMaterialRequest req = new TbkDgOptimusMaterialRequest();
        req.setPageSize(20L);
        req.setAdzoneId(123L);
        req.setPageNo(1L);
        req.setMaterialId(123L);
        req.setDeviceValue("xxx");
        req.setDeviceEncrypt("MD5");
        req.setDeviceType("IMEI");
        req.setContentId(323L);
        req.setContentSource("xxx");
        req.setItemId(33243L);
        req.setFavoritesId("123445");
        TbkDgOptimusMaterialResponse rsp = null;
        try {
            rsp = client.execute(req);
        } catch (ApiException e) {
            e.printStackTrace();
        }
        System.out.println(rsp.getBody());
    }
}
