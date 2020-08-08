package com.najia.quan.taobao.bo.productSearch;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


/**
 * 淘宝联盟返回的具体数据结构
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductSearchMapData {

    /**
     * 商品信息-叶子类目id
     */
    private Long categoryId;
    /**
     * 商品信息-叶子类目名称
     */
    private String categoryName;
    /**
     * 商品信息-佣金比率。1550表示15.5%
     */
    private String commissionRate;
    /**
     * 商品信息-佣金类型。MKT表示营销计划，SP表示定向计划，COMMON表示通用计划
     */
    private String commissionType;
    /**
     * 优惠券（元） 若属于预售商品，该优惠券付尾款可用，付定金不可用
     */
    private String couponAmount;
    /**
     * 优惠券信息-优惠券结束时间
     */
    private String couponEndTime;
    /**
     * 优惠券信息-优惠券id
     */
    private String couponId;
    /**
     * 优惠券信息-优惠券满减信息
     */
    private String couponInfo;
    /**
     * 优惠券信息-优惠券剩余量
     */
    private Long couponRemainCount;
    /**
     * 链接-宝贝+券二合一页面链接
     */
    private String couponShareUrl;
    /**
     * 优惠券信息-优惠券起用门槛，满X元可用。如：满299元减20元
     */
    private String couponStartFee;
    /**
     * 优惠券信息-优惠券开始时间
     */
    private String couponStartTime;
    /**
     * 优惠券信息-优惠券总量
     */
    private Long couponTotalCount;
    /**
     * 本地化-到门店距离（米）
     */
    private String distance;
    /**
     * 商品信息-是否包含定向计划
     */
    private String includeDxjh;
    /**
     * 商品信息-是否包含营销计划
     */
    private String includeMkt;
    /**
     * 商品信息-定向计划信息
     */
    private String infoDxjh;
    /**
     * 商品信息-宝贝描述(推荐理由)
     */
    private String itemDescription;
    /**
     * 商品信息-宝贝id
     */
    private Long itemId;
    /**
     * 链接-宝贝地址
     */
    private String itemUrl;
    /**
     * 拼团专用-拼团几人团
     */
    private Long jddNum;
    /**
     * 拼团专用-拼团拼成价，单位元
     */
    private String jddPrice;
    /**
     * 跨店满减信息
     */
    private String kuadianPromotionInfo;
    /**
     * 商品信息-一级类目ID
     */
    private Long levelOneCategoryId;
    /**
     * 商品信息-一级类目名称
     */
    private String levelOneCategoryName;
    /**
     * 锁住的佣金率
     */
    private String lockRate;
    /**
     * 锁佣结束时间
     */
    private Long lockRateEndTime;
    /**
     * 锁佣开始时间
     */
    private Long lockRateStartTime;
    /**
     * 店铺信息-卖家昵称
     */
    private String nick;
    /**
     * 商品信息-宝贝id(该字段废弃，请勿再用)
     */
    private Long numIid;
    /**
     * 拼团专用-拼团结束时间
     */
    private String oetime;
    /**
     * 拼团专用-拼团一人价（原价)，单位元
     */
    private String origPrice;
    /**
     * 拼团专用-拼团开始时间
     */
    private String ostime;
    /**
     * 商品信息-商品主图
     */
    private String pictUrl;
    /**
     * 预售商品-定金（元）
     */
    private String presaleDeposit;
    /**
     * 预售商品-优惠
     */
    private String presaleDiscountFeeText;
    /**
     * 预售商品-付定金结束时间（毫秒）
     */
    private Long presaleEndTime;
    /**
     * 预售商品-付定金开始时间（毫秒）
     */
    private Long presaleStartTime;
    /**
     * 预售商品-付尾款结束时间（毫秒）
     */
    private Long presaleTailEndTime;
    /**
     * 预售商品-付尾款开始时间（毫秒）
     */
    private Long presaleTailStartTime;
    /**
     * 商品信息-宝贝所在地
     */
    private String provcity;
    /**
     * 商品邮费
     */
    private String realPostFee;
    /**
     * 商品信息-商品一口价格
     */
    private String reservePrice;
    /**
     * 本地化-销售开始时间
     */
    private String saleBeginTime;
    /**
     * 本地化-销售结束时间
     */
    private String saleEndTime;
    /**
     * 活动价
     */
    private String salePrice;
    /**
     * 拼团专用-拼团已售数量
     */
    private Long sellNum;
    /**
     * 店铺信息-卖家id
     */
    private Long sellerId;
    /**
     * 店铺信息-店铺dsr评分
     */
    private Long shopDsr;
    /**
     * 店铺信息-店铺名称
     */
    private String shopTitle;
    /**
     * 商品信息-商品短标题
     */
    private String shortTitle;
    /**
     * 商品信息-商品小图列表
     */
    private String smallImages;
    /**
     * 拼团专用-拼团剩余库存
     */
    private Long stock;
    /**
     * 商品信息-商品标题
     */
    private String title;
    /**
     * 商品信息-月支出佣金(该字段废弃，请勿再用)
     */
    private String tkTotalCommi;
    /**
     * 商品信息-淘客30天推广量
     */
    private String tkTotalSales;
    /**
     * 营销-天猫营销玩法
     */
    private String tmallPlayActivityInfo;
    /**
     * 拼团专用-拼团库存数量
     */
    private Long totalStock;
    /**
     * 链接-宝贝推广链接
     */
    private String url;
    /**
     * 本地化-可用店铺id
     */
    private String usableShopId;
    /**
     * 本地化-可用店铺名称
     */

    private String usableShopName;
    /**
     * 店铺信息-卖家类型。0表示集市，1表示天猫
     */

    private Long userType;
    /**
     * 预售专用-预售数量
     */

    private Long uvSumPreSale;
    /**
     * 商品信息-30天销量（饿了么卡券信息-总销量）
     */

    private Long volume;
    /**
     * 商品信息-商品白底图
     */

    private String whiteImage;
    /**
     * 链接-物料块id(测试中请勿使用)
     */

    private String xId;
    /**
     * 预售有礼-推广链接
     */

    private String ysylClickUrl;
    /**
     * 预售有礼-佣金比例（ 预售有礼活动享受的推广佣金比例，注：推广该活动有特殊分成规则，请详见：https:tbk.bbs.taobao.comdetail.html?appId=45301&postId=9334376 ）
     */

    private String ysylCommissionRate;
    /**
     * 预售有礼-预估淘礼金（元）
     */

    private String ysylTljFace;
    /**
     * 预售有礼-淘礼金发放时间
     */

    private String ysylTljSendTime;
    /**
     * 预售有礼-淘礼金使用结束时间
     */

    private String ysylTljUseEndTime;
    /**
     * 预售有礼-淘礼金使用开始时间
     */

    private String ysylTljUseStartTime;
    /**
     * 折扣价（元） 若属于预售商品，付定金时间内，折扣价=预售价
     */

    private String zkFinalPrice;
}
