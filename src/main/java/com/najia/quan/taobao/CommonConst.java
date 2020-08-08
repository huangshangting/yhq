package com.najia.quan.taobao;

import java.util.ArrayList;
import java.util.List;

public class CommonConst {

    private CommonConst(){}

    public static final String TAOBAO_URL = "http://gw.api.taobao.com/router/rest";

    public static final String APP_KEY = "30139857";

    public static final String APP_SECRET = "c08ccb3ff49a222149b3f1876f25cad0";

    public static final String KOULING_URL = "https://api.taokouling.com/tkl/tkljm?apikey=NftkrqaxiI&tkl=";

    public static final String KOULING_RET_CODE_OK = "1";

    public static final String ITEMID_MATCH_STR = "&itemId=";

    public static final String ID_MATCH_STR = "&id=";

    public static final String I_MATCH_STR = "/i";

    public static final String PARAM_CONNECT_CHART = "&";

    public static final String DOT_CHART = "\\.";

    public static final String TAOID_URL = "https://item.taobao.com/item.htm?id=";

    public static final String DEFAUL_KOULING_QUESTION = "";

    public static final int STRSPLIT_LENGTH = 2;

    public static final int KOULING_PARAM_LENGTH = 30;

    public static final long  ADZONEID = 110495600319L;

    public static final long MAX_PAGE_SIZE = 100L;

    public static final String HTTP_STR = "http:";

    public static final List<Long> catList = new ArrayList<>();

    static {
        // 相似推荐
        catList.add(32366L); // 聚划算满减满折 ID
        catList.add(27160L); // 猫超满减满折 ID
        catList.add(13256L); // 相似推荐
        // 好券直播
        catList.add(3756L); // 综合
        catList.add(3767L); // 女装
        catList.add(3758L); // 家居家装
        catList.add(3759L); // 数码家电
        catList.add(3762L); // 鞋包配饰
        catList.add(3763L); // 美妆个护
        catList.add(3764L); // 男装
        catList.add(3765L); // 内衣
        catList.add(3760L); // 母婴
        catList.add(3761L); // 食品
        catList.add(3766L); // 运动户外
        // 猜你喜欢
        catList.add(6708L); // 含全部商品
        // 优选类物料
        // 实时热销榜
        catList.add(28026L); // 综合
        catList.add(28029L); // 大服饰
        catList.add(28027L); // 大快消
        catList.add(28028L); // 电器美家
        // 大额券
        catList.add(27446L); // 综合
        catList.add(27448L); // 女装
        catList.add(27451L); // 食品
        catList.add(27453L); // 美妆个护
        catList.add(27798L); // 家居家装
        catList.add(27454L); // 母婴
        // 高佣榜
        catList.add(13366L); // 综合
        catList.add(13367L); // 女装
        catList.add(13368L); // 家居家装
        catList.add(13369L); // 数码家电
        catList.add(13370L); // 鞋包配饰
        catList.add(13371L); // 美妆个护
        catList.add(13372L); // 男装
        catList.add(13373L); // 内衣
        catList.add(13374L); // 母婴
        catList.add(13375L); // 食品
        catList.add(13376L); // 运动户外
        // 品牌券
        catList.add(3786L); // 综合
        catList.add(3788L); // 女装
        catList.add(3792L); // 家居家装
        catList.add(3793L); // 数码家电
        catList.add(3796L); // 鞋包配饰
        catList.add(3794L); // 美妆个护
        catList.add(3790L); // 男装
        catList.add(3787L); // 内衣
        catList.add(3789L); // 母婴
        catList.add(3791L); // 食品
        catList.add(3795L); // 运动户外
        // 猫超优质爆款
        catList.add(27162L); // 猫超1元购凑单API
        catList.add(27161L); // 猫超第二件0元API
        catList.add(27160L); // 猫超单件满减包邮API
        // 天天特卖
        catList.add(31362L); // 开团热卖中
        // 母婴主题
        catList.add(4040L); // 母婴_备孕
        catList.add(4041L); // 母婴_0至6个月
        catList.add(4044L); // 母婴_4至6岁
        catList.add(4042L); // 母婴_7至12个月
        catList.add(4043L); // 母婴_1至3岁
        catList.add(4045L); // 母婴_7至12岁
        // 有好货
        catList.add(4092L); // 有好货
        catList.add(4093L); // 潮流范
        catList.add(4094L); // 特惠
    }
}
