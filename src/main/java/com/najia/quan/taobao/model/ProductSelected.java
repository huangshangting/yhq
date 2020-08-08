package com.najia.quan.taobao.model;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductSelected {
    private Integer selectedId;

    private Long categoryId;

    private String categoryName;

    private String clickUrl;

    private String commissionRate;

    private Long couponAmount;

    private String couponEndTime;

    private String couponInfo;

    private Long couponRemainCount;

    private String couponShareUrl;

    private String couponStartFee;

    private String couponStartTime;

    private Long couponTotalCount;

    private Integer favoritesInfo;

    private String itemDescription;

    private Long itemId;

    private Long jddNum;

    private String jddPrice;

    private String jhsPriceUspList;

    private String juOnlineEndTime;

    private String juOnlineStartTime;

    private Long juPlayEndTime;

    private Long juPlayStartTime;

    private String juPreShowEndTime;

    private String juPreShowStartTime;

    private String kuadianPromotionInfo;

    private Long levelOneCategoryId;

    private String levelOneCategoryName;

    private String lockRate;

    private Long lockRateEndTime;

    private Long lockRateStartTime;

    private String maochaoPlayConditions;

    private String maochaoPlayDiscountType;

    private String maochaoPlayDiscounts;

    private String maochaoPlayEndTime;

    private String maochaoPlayFreePostFee;

    private String maochaoPlayStartTime;

    private String multiCouponItemCount;

    private String multiCouponZkRate;

    private String newUserPrice;

    private String nick;

    private String oetime;

    private String origPrice;

    private String ostime;

    private String pictUrl;

    private String playInfo;

    private String presaleDeposit;

    private String presaleDiscountFeeText;

    private Long presaleEndTime;

    private Long presaleStartTime;

    private Long presaleTailEndTime;

    private Long presaleTailStartTime;

    private String priceAfterMultiCoupon;

    private String promotionCondition;

    private String promotionDiscount;

    private String promotionInfo;

    private String promotionType;

    private String reservePrice;

    private String salePrice;

    private Long sellNum;

    private Long sellerId;

    private String shopTitle;

    private String shortTitle;

    private String smallImages;

    private Long stock;

    private String subTitle;

    private String title;

    private Long tmallPlayActivityEndTime;

    private String tmallPlayActivityInfo;

    private Long tmallPlayActivityStartTime;

    private Long totalStock;

    private Long userType;

    private Long uvSumPreSale;

    private Long volume;

    private String whiteImage;

    private String wordList;

    private String xId;

    private String ysylClickUrl;

    private String ysylCommissionRate;

    private String ysylTljFace;

    private String ysylTljSendTime;

    private String ysylTljUseEndTime;

    private String ysylTljUseStartTime;

    private String zkFinalPrice;

    private Long createTime;

    private Long updateTime;

    private Long materialId;

    public Integer getSelectedId() {
        return selectedId;
    }

    public void setSelectedId(Integer selectedId) {
        this.selectedId = selectedId;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getClickUrl() {
        return clickUrl;
    }

    public void setClickUrl(String clickUrl) {
        this.clickUrl = clickUrl == null ? null : clickUrl.trim();
    }

    public String getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(String commissionRate) {
        this.commissionRate = commissionRate == null ? null : commissionRate.trim();
    }

    public Long getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Long couponAmount) {
        this.couponAmount = couponAmount;
    }

    public String getCouponEndTime() {
        return couponEndTime;
    }

    public void setCouponEndTime(String couponEndTime) {
        this.couponEndTime = couponEndTime == null ? null : couponEndTime.trim();
    }

    public String getCouponInfo() {
        return couponInfo;
    }

    public void setCouponInfo(String couponInfo) {
        this.couponInfo = couponInfo == null ? null : couponInfo.trim();
    }

    public Long getCouponRemainCount() {
        return couponRemainCount;
    }

    public void setCouponRemainCount(Long couponRemainCount) {
        this.couponRemainCount = couponRemainCount;
    }

    public String getCouponShareUrl() {
        return couponShareUrl;
    }

    public void setCouponShareUrl(String couponShareUrl) {
        this.couponShareUrl = couponShareUrl == null ? null : couponShareUrl.trim();
    }

    public String getCouponStartFee() {
        return couponStartFee;
    }

    public void setCouponStartFee(String couponStartFee) {
        this.couponStartFee = couponStartFee == null ? null : couponStartFee.trim();
    }

    public String getCouponStartTime() {
        return couponStartTime;
    }

    public void setCouponStartTime(String couponStartTime) {
        this.couponStartTime = couponStartTime == null ? null : couponStartTime.trim();
    }

    public Long getCouponTotalCount() {
        return couponTotalCount;
    }

    public void setCouponTotalCount(Long couponTotalCount) {
        this.couponTotalCount = couponTotalCount;
    }

    public Integer getFavoritesInfo() {
        return favoritesInfo;
    }

    public void setFavoritesInfo(Integer favoritesInfo) {
        this.favoritesInfo = favoritesInfo;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription == null ? null : itemDescription.trim();
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public Long getJddNum() {
        return jddNum;
    }

    public void setJddNum(Long jddNum) {
        this.jddNum = jddNum;
    }

    public String getJddPrice() {
        return jddPrice;
    }

    public void setJddPrice(String jddPrice) {
        this.jddPrice = jddPrice == null ? null : jddPrice.trim();
    }

    public String getJhsPriceUspList() {
        return jhsPriceUspList;
    }

    public void setJhsPriceUspList(String jhsPriceUspList) {
        this.jhsPriceUspList = jhsPriceUspList == null ? null : jhsPriceUspList.trim();
    }

    public String getJuOnlineEndTime() {
        return juOnlineEndTime;
    }

    public void setJuOnlineEndTime(String juOnlineEndTime) {
        this.juOnlineEndTime = juOnlineEndTime == null ? null : juOnlineEndTime.trim();
    }

    public String getJuOnlineStartTime() {
        return juOnlineStartTime;
    }

    public void setJuOnlineStartTime(String juOnlineStartTime) {
        this.juOnlineStartTime = juOnlineStartTime == null ? null : juOnlineStartTime.trim();
    }

    public Long getJuPlayEndTime() {
        return juPlayEndTime;
    }

    public void setJuPlayEndTime(Long juPlayEndTime) {
        this.juPlayEndTime = juPlayEndTime;
    }

    public Long getJuPlayStartTime() {
        return juPlayStartTime;
    }

    public void setJuPlayStartTime(Long juPlayStartTime) {
        this.juPlayStartTime = juPlayStartTime;
    }

    public String getJuPreShowEndTime() {
        return juPreShowEndTime;
    }

    public void setJuPreShowEndTime(String juPreShowEndTime) {
        this.juPreShowEndTime = juPreShowEndTime == null ? null : juPreShowEndTime.trim();
    }

    public String getJuPreShowStartTime() {
        return juPreShowStartTime;
    }

    public void setJuPreShowStartTime(String juPreShowStartTime) {
        this.juPreShowStartTime = juPreShowStartTime == null ? null : juPreShowStartTime.trim();
    }

    public String getKuadianPromotionInfo() {
        return kuadianPromotionInfo;
    }

    public void setKuadianPromotionInfo(String kuadianPromotionInfo) {
        this.kuadianPromotionInfo = kuadianPromotionInfo == null ? null : kuadianPromotionInfo.trim();
    }

    public Long getLevelOneCategoryId() {
        return levelOneCategoryId;
    }

    public void setLevelOneCategoryId(Long levelOneCategoryId) {
        this.levelOneCategoryId = levelOneCategoryId;
    }

    public String getLevelOneCategoryName() {
        return levelOneCategoryName;
    }

    public void setLevelOneCategoryName(String levelOneCategoryName) {
        this.levelOneCategoryName = levelOneCategoryName == null ? null : levelOneCategoryName.trim();
    }

    public String getLockRate() {
        return lockRate;
    }

    public void setLockRate(String lockRate) {
        this.lockRate = lockRate == null ? null : lockRate.trim();
    }

    public Long getLockRateEndTime() {
        return lockRateEndTime;
    }

    public void setLockRateEndTime(Long lockRateEndTime) {
        this.lockRateEndTime = lockRateEndTime;
    }

    public Long getLockRateStartTime() {
        return lockRateStartTime;
    }

    public void setLockRateStartTime(Long lockRateStartTime) {
        this.lockRateStartTime = lockRateStartTime;
    }

    public String getMaochaoPlayConditions() {
        return maochaoPlayConditions;
    }

    public void setMaochaoPlayConditions(String maochaoPlayConditions) {
        this.maochaoPlayConditions = maochaoPlayConditions == null ? null : maochaoPlayConditions.trim();
    }

    public String getMaochaoPlayDiscountType() {
        return maochaoPlayDiscountType;
    }

    public void setMaochaoPlayDiscountType(String maochaoPlayDiscountType) {
        this.maochaoPlayDiscountType = maochaoPlayDiscountType == null ? null : maochaoPlayDiscountType.trim();
    }

    public String getMaochaoPlayDiscounts() {
        return maochaoPlayDiscounts;
    }

    public void setMaochaoPlayDiscounts(String maochaoPlayDiscounts) {
        this.maochaoPlayDiscounts = maochaoPlayDiscounts == null ? null : maochaoPlayDiscounts.trim();
    }

    public String getMaochaoPlayEndTime() {
        return maochaoPlayEndTime;
    }

    public void setMaochaoPlayEndTime(String maochaoPlayEndTime) {
        this.maochaoPlayEndTime = maochaoPlayEndTime == null ? null : maochaoPlayEndTime.trim();
    }

    public String getMaochaoPlayFreePostFee() {
        return maochaoPlayFreePostFee;
    }

    public void setMaochaoPlayFreePostFee(String maochaoPlayFreePostFee) {
        this.maochaoPlayFreePostFee = maochaoPlayFreePostFee == null ? null : maochaoPlayFreePostFee.trim();
    }

    public String getMaochaoPlayStartTime() {
        return maochaoPlayStartTime;
    }

    public void setMaochaoPlayStartTime(String maochaoPlayStartTime) {
        this.maochaoPlayStartTime = maochaoPlayStartTime == null ? null : maochaoPlayStartTime.trim();
    }

    public String getMultiCouponItemCount() {
        return multiCouponItemCount;
    }

    public void setMultiCouponItemCount(String multiCouponItemCount) {
        this.multiCouponItemCount = multiCouponItemCount == null ? null : multiCouponItemCount.trim();
    }

    public String getMultiCouponZkRate() {
        return multiCouponZkRate;
    }

    public void setMultiCouponZkRate(String multiCouponZkRate) {
        this.multiCouponZkRate = multiCouponZkRate == null ? null : multiCouponZkRate.trim();
    }

    public String getNewUserPrice() {
        return newUserPrice;
    }

    public void setNewUserPrice(String newUserPrice) {
        this.newUserPrice = newUserPrice == null ? null : newUserPrice.trim();
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public String getOetime() {
        return oetime;
    }

    public void setOetime(String oetime) {
        this.oetime = oetime == null ? null : oetime.trim();
    }

    public String getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(String origPrice) {
        this.origPrice = origPrice == null ? null : origPrice.trim();
    }

    public String getOstime() {
        return ostime;
    }

    public void setOstime(String ostime) {
        this.ostime = ostime == null ? null : ostime.trim();
    }

    public String getPictUrl() {
        return pictUrl;
    }

    public void setPictUrl(String pictUrl) {
        this.pictUrl = pictUrl == null ? null : pictUrl.trim();
    }

    public String getPlayInfo() {
        return playInfo;
    }

    public void setPlayInfo(String playInfo) {
        this.playInfo = playInfo == null ? null : playInfo.trim();
    }

    public String getPresaleDeposit() {
        return presaleDeposit;
    }

    public void setPresaleDeposit(String presaleDeposit) {
        this.presaleDeposit = presaleDeposit == null ? null : presaleDeposit.trim();
    }

    public String getPresaleDiscountFeeText() {
        return presaleDiscountFeeText;
    }

    public void setPresaleDiscountFeeText(String presaleDiscountFeeText) {
        this.presaleDiscountFeeText = presaleDiscountFeeText == null ? null : presaleDiscountFeeText.trim();
    }

    public Long getPresaleEndTime() {
        return presaleEndTime;
    }

    public void setPresaleEndTime(Long presaleEndTime) {
        this.presaleEndTime = presaleEndTime;
    }

    public Long getPresaleStartTime() {
        return presaleStartTime;
    }

    public void setPresaleStartTime(Long presaleStartTime) {
        this.presaleStartTime = presaleStartTime;
    }

    public Long getPresaleTailEndTime() {
        return presaleTailEndTime;
    }

    public void setPresaleTailEndTime(Long presaleTailEndTime) {
        this.presaleTailEndTime = presaleTailEndTime;
    }

    public Long getPresaleTailStartTime() {
        return presaleTailStartTime;
    }

    public void setPresaleTailStartTime(Long presaleTailStartTime) {
        this.presaleTailStartTime = presaleTailStartTime;
    }

    public String getPriceAfterMultiCoupon() {
        return priceAfterMultiCoupon;
    }

    public void setPriceAfterMultiCoupon(String priceAfterMultiCoupon) {
        this.priceAfterMultiCoupon = priceAfterMultiCoupon == null ? null : priceAfterMultiCoupon.trim();
    }

    public String getPromotionCondition() {
        return promotionCondition;
    }

    public void setPromotionCondition(String promotionCondition) {
        this.promotionCondition = promotionCondition == null ? null : promotionCondition.trim();
    }

    public String getPromotionDiscount() {
        return promotionDiscount;
    }

    public void setPromotionDiscount(String promotionDiscount) {
        this.promotionDiscount = promotionDiscount == null ? null : promotionDiscount.trim();
    }

    public String getPromotionInfo() {
        return promotionInfo;
    }

    public void setPromotionInfo(String promotionInfo) {
        this.promotionInfo = promotionInfo == null ? null : promotionInfo.trim();
    }

    public String getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType == null ? null : promotionType.trim();
    }

    public String getReservePrice() {
        return reservePrice;
    }

    public void setReservePrice(String reservePrice) {
        this.reservePrice = reservePrice == null ? null : reservePrice.trim();
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice == null ? null : salePrice.trim();
    }

    public Long getSellNum() {
        return sellNum;
    }

    public void setSellNum(Long sellNum) {
        this.sellNum = sellNum;
    }

    public Long getSellerId() {
        return sellerId;
    }

    public void setSellerId(Long sellerId) {
        this.sellerId = sellerId;
    }

    public String getShopTitle() {
        return shopTitle;
    }

    public void setShopTitle(String shopTitle) {
        this.shopTitle = shopTitle == null ? null : shopTitle.trim();
    }

    public String getShortTitle() {
        return shortTitle;
    }

    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle == null ? null : shortTitle.trim();
    }

    public String getSmallImages() {
        return smallImages;
    }

    public void setSmallImages(String smallImages) {
        this.smallImages = smallImages == null ? null : smallImages.trim();
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getTmallPlayActivityEndTime() {
        return tmallPlayActivityEndTime;
    }

    public void setTmallPlayActivityEndTime(Long tmallPlayActivityEndTime) {
        this.tmallPlayActivityEndTime = tmallPlayActivityEndTime;
    }

    public String getTmallPlayActivityInfo() {
        return tmallPlayActivityInfo;
    }

    public void setTmallPlayActivityInfo(String tmallPlayActivityInfo) {
        this.tmallPlayActivityInfo = tmallPlayActivityInfo == null ? null : tmallPlayActivityInfo.trim();
    }

    public Long getTmallPlayActivityStartTime() {
        return tmallPlayActivityStartTime;
    }

    public void setTmallPlayActivityStartTime(Long tmallPlayActivityStartTime) {
        this.tmallPlayActivityStartTime = tmallPlayActivityStartTime;
    }

    public Long getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(Long totalStock) {
        this.totalStock = totalStock;
    }

    public Long getUserType() {
        return userType;
    }

    public void setUserType(Long userType) {
        this.userType = userType;
    }

    public Long getUvSumPreSale() {
        return uvSumPreSale;
    }

    public void setUvSumPreSale(Long uvSumPreSale) {
        this.uvSumPreSale = uvSumPreSale;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public String getWhiteImage() {
        return whiteImage;
    }

    public void setWhiteImage(String whiteImage) {
        this.whiteImage = whiteImage == null ? null : whiteImage.trim();
    }

    public String getWordList() {
        return wordList;
    }

    public void setWordList(String wordList) {
        this.wordList = wordList == null ? null : wordList.trim();
    }

    public String getxId() {
        return xId;
    }

    public void setxId(String xId) {
        this.xId = xId == null ? null : xId.trim();
    }

    public String getYsylClickUrl() {
        return ysylClickUrl;
    }

    public void setYsylClickUrl(String ysylClickUrl) {
        this.ysylClickUrl = ysylClickUrl == null ? null : ysylClickUrl.trim();
    }

    public String getYsylCommissionRate() {
        return ysylCommissionRate;
    }

    public void setYsylCommissionRate(String ysylCommissionRate) {
        this.ysylCommissionRate = ysylCommissionRate == null ? null : ysylCommissionRate.trim();
    }

    public String getYsylTljFace() {
        return ysylTljFace;
    }

    public void setYsylTljFace(String ysylTljFace) {
        this.ysylTljFace = ysylTljFace == null ? null : ysylTljFace.trim();
    }

    public String getYsylTljSendTime() {
        return ysylTljSendTime;
    }

    public void setYsylTljSendTime(String ysylTljSendTime) {
        this.ysylTljSendTime = ysylTljSendTime == null ? null : ysylTljSendTime.trim();
    }

    public String getYsylTljUseEndTime() {
        return ysylTljUseEndTime;
    }

    public void setYsylTljUseEndTime(String ysylTljUseEndTime) {
        this.ysylTljUseEndTime = ysylTljUseEndTime == null ? null : ysylTljUseEndTime.trim();
    }

    public String getYsylTljUseStartTime() {
        return ysylTljUseStartTime;
    }

    public void setYsylTljUseStartTime(String ysylTljUseStartTime) {
        this.ysylTljUseStartTime = ysylTljUseStartTime == null ? null : ysylTljUseStartTime.trim();
    }

    public String getZkFinalPrice() {
        return zkFinalPrice;
    }

    public void setZkFinalPrice(String zkFinalPrice) {
        this.zkFinalPrice = zkFinalPrice == null ? null : zkFinalPrice.trim();
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }
}