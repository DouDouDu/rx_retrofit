package com.bawei.test.bean;

import java.util.List;

/**
 * 1：类的用途
 * 2：@author 张倩
 * 3:@date 2017/11/15 13:55
 */

public class MyBean {


    /**
     * code : 200
     * msg : success
     * data : [{"id":"121","goods_name":"镇店之宝丨美白嫩肤面膜7片","shop_price":49.9,"market_price":99,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/121/goods_img/17062610568378169043195978.jpg","sales_volume":126638,"efficacy":"镇店之宝 美白爆款","goods_type":"0","activityPrice":49.9,"sort":0},{"id":"684","goods_name":"解救肌渴丨花粹水润面膜套装10片","shop_price":29.9,"market_price":139,"is_coupon_allowed":false,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/684/goods_img/17062610401397749701177609.jpg","sales_volume":104677,"efficacy":"水润充盈 鲜嫩少女肌","goods_type":"0","activityPrice":29.9,"sort":0},{"id":"772","goods_name":"热销爆款丨清润莹亮黑膜套装21片","shop_price":79.9,"market_price":297,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/772/goods_img/171016095389114258195255761.jpg","sales_volume":82674,"efficacy":"自然莹亮  水感瓷肌","goods_type":"0","activityPrice":99.9,"sort":0},{"id":"8","goods_name":"两件立减30丨美白嫩肤面膜20片","shop_price":119.9,"market_price":359,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/8/goods_img/170818182578717903477668239.jpg","sales_volume":41936,"efficacy":"真美白 匠心造","goods_type":"0","activityPrice":129.9,"sort":0},{"id":"87","goods_name":"玫瑰滋养面膜7片","shop_price":79,"market_price":89,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/87/goods_img/170904211885816205585811962.jpg","sales_volume":22117,"efficacy":"岂止补水 更能锁水","goods_type":"0","activityPrice":1,"sort":0},{"id":"1189","goods_name":"新品上市丨清透盈润面膜套装21片","shop_price":59.9,"market_price":297,"is_coupon_allowed":false,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1189/goods_img/17093019432252555150652465.jpg","sales_volume":16204,"efficacy":"水感剔透 鲜颜嫩肌","goods_type":"0","activityPrice":59.9,"sort":0},{"id":"745","goods_name":"全新升级丨晶亮红石榴面膜7片","shop_price":79,"market_price":89,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/745/goods_img/17081617418998795654179347.jpg","sales_volume":12267,"efficacy":"深度排浊 一扫黯哑","goods_type":"0","activityPrice":79,"sort":0},{"id":"161","goods_name":"送7片共14片|男士补水活力矿物蚕丝7片","shop_price":59.9,"market_price":99,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/161/goods_img/170626104914816121546518189.jpg","sales_volume":10154,"efficacy":"补水保湿 清爽控油","goods_type":"0","activityPrice":49.9,"sort":0},{"id":"1638","goods_name":"嫩肌酵素黑膜礼盒21片","shop_price":139.9,"market_price":299,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1638/goods_img/170905151496114997886544712.jpg","sales_volume":9799,"efficacy":"极地酵素 \u201c酵\u201d醒美肌","goods_type":"0","activityPrice":89.9,"sort":0},{"id":"319","goods_name":"补水首选丨男士补水活力矿物蚕丝21片","shop_price":99.9,"market_price":297,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/319/goods_img/17062610389308105384234516.jpg","sales_volume":7464,"efficacy":"畅爽补水 活力四射","goods_type":"0","activityPrice":99.9,"sort":0},{"id":"868","goods_name":"男士黑茶清爽矿物面膜  今日买5片送5片","shop_price":49.9,"market_price":150,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/868/goods_img/17062610333352551606068502.jpg","sales_volume":5199,"efficacy":"洁净控油 强劲清爽","goods_type":"0","activityPrice":49.9,"sort":0},{"id":"1830","goods_name":"新品尝鲜|水润茶萃微囊黑面膜20片","shop_price":129.9,"market_price":297,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1830/goods_img/17063017284962337647468682.jpg","sales_volume":5086,"efficacy":"只要一片 水润一天","goods_type":"0","activityPrice":0,"sort":0},{"id":"2039","goods_name":"两件立减20丨水润柔嫩黑膜21片","shop_price":89.9,"market_price":297,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/2039/goods_img/17093020002498271170145819.jpg","sales_volume":3635,"efficacy":"自然纯粹 水润纯净","goods_type":"0","activityPrice":0,"sort":0},{"id":"1870","goods_name":"新品尝鲜|玉润雪肌黑白膜盒20片","shop_price":129.9,"market_price":297,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1870/goods_img/17071909555120332464127704.jpg","sales_volume":3588,"efficacy":"黑白膜力 美肌如玉","goods_type":"0","activityPrice":129,"sort":0},{"id":"514","goods_name":"男士清爽净痘亮采套装21片","shop_price":109.9,"market_price":297,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/514/goods_img/170626105146115845247362007.jpg","sales_volume":3125,"efficacy":"清爽控油 净痘亮彩","goods_type":"0","activityPrice":109.9,"sort":0},{"id":"1919","goods_name":"两件立减30丨透亮红酒酵力面膜21片","shop_price":99.9,"market_price":239,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1919/goods_img/170630171021217601465422538.jpg","sales_volume":2666,"efficacy":"红酒透亮 酵醒美肌","goods_type":"0","activityPrice":0,"sort":0},{"id":"2305","goods_name":"美白嫩肤面膜20片A字体定制（送B字体定制）","shop_price":219.9,"market_price":359,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/2305/goods_img/171019220993121310106209814.jpg","sales_volume":2427,"efficacy":"真美白 匠心造","goods_type":"0","activityPrice":0,"sort":0},{"id":"871","goods_name":"男士深海水动力面膜5片","shop_price":39.9,"market_price":99,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/871/goods_img/170626102661714895717277379.jpg","sales_volume":1521,"efficacy":"水润肌肤 有效锁水","goods_type":"0","activityPrice":39.9,"sort":0},{"id":"1195","goods_name":"两件立减30丨水漾冰川面膜20片","shop_price":99.9,"market_price":298,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1195/�水润 嫩颜美莓","goods_type":"0","activityPrice":0,"sort":0},{"id":"2093","goods_name":"科学搭配丨补水亮颜面膜14片","shop_price":99,"market_price":178,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/2093/goods_img/170905214153415629965477601.jpg","sales_volume":584,"efficacy":"水润保湿 亮肤排浊","goods_type":"0","activityPrice":0,"sort":0},{"id":"1330","goods_name":"新品推荐|男士冰川深润补水面膜","shop_price":49.9,"market_price":99,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1330/goods_img/170626103331019649572381031.jpg","sales_volume":217,"efficacy":"深润补水 有效保湿","goods_type":"0","activityPrice":49.9,"sort":0},{"id":"1699","goods_name":"男士新品丨玉石紧致细肤水凝面膜","shop_price":99.9,"market_price":159,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1699/goods_img/17062611525378027557967390.jpg","sales_volume":174,"efficacy":"紧致细肤 平抚肌纹","goods_type":"0","activityPrice":99.9,"sort":0},{"id":"1226","goods_name":"男士白茶控油面膜5片","shop_price":39.9,"market_price":75,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1226/goods_img/17062610243198877646356953.jpg","sales_volume":163,"efficacy":"清爽控油 净化肌肤","goods_type":"0","activityPrice":39.9,"sort":0},{"id":"2454","goods_name":"新品首发丨鱼子酱紧致安瓶面膜5片（送精华液）","shop_price":79.9,"market_price":299,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/2454/goods_img/17111616021971202108001242.jpg","sales_volume":156,"efficacy":"提拉紧致 保湿滋润","goods_type":"0","activityPrice":0,"sort":0},{"id":"1354","goods_name":"男士新品丨海藻补水面膜5片","shop_price":39.9,"market_price":75,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1354/goods_img/170626102175310181601137642.jpg","sales_volume":147,"efficacy":"深入补水 有效保湿","goods_type":"0","activityPrice":39.9,"sort":0},{"id":"1213","goods_name":"橄榄石畅透亮肤黑面膜5片","shop_price":59.9,"market_price":119,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1213/goods_img/170626103224614443630261149.jpg","sales_volume":121,"efficacy":"控油亮肤 清爽透亮","goods_type":"0","activityPrice":59.9,"sort":0},{"id":"1214","goods_name":"男士新品|海盐炫活亮肤面膜","shop_price":49.9,"market_price":99,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1214/goods_img/17062610325420751596339622.jpg","sales_volume":112,"efficacy":"炫活亮肤 清爽舒缓","goods_type":"0","activityPrice":49.9,"sort":0},{"id":"1215","goods_name":"火山岩净透控油黑面膜5片","shop_price":49.9,"market_price":119,"is_coupon_allowed":true,"is_allow_credit":false,"goods_img":"https://image.yunifang.com/yunifang/images/goods/1215/goods_img/17062610306901109639527416.jpg","sales_volume":112,"efficacy":"净透控油 舒爽体验","goods_type":"0","activityPrice":49.9,"sort":0}]
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 121
         * goods_name : 镇店之宝丨美白嫩肤面膜7片
         * shop_price : 49.9
         * market_price : 99.0
         * is_coupon_allowed : true
         * is_allow_credit : false
         * goods_img : https://image.yunifang.com/yunifang/images/goods/121/goods_img/17062610568378169043195978.jpg
         * sales_volume : 126638
         * efficacy : 镇店之宝 美白爆款
         * goods_type : 0
         * activityPrice : 49.9
         * sort : 0
         */

        private String id;
        private String goods_name;
        private double shop_price;
        private double market_price;
        private boolean is_coupon_allowed;
        private boolean is_allow_credit;
        private String goods_img;
        private int sales_volume;
        private String efficacy;
        private String goods_type;
        private double activityPrice;
        private int sort;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getGoods_name() {
            return goods_name;
        }

        public void setGoods_name(String goods_name) {
            this.goods_name = goods_name;
        }

        public double getShop_price() {
            return shop_price;
        }

        public void setShop_price(double shop_price) {
            this.shop_price = shop_price;
        }

        public double getMarket_price() {
            return market_price;
        }

        public void setMarket_price(double market_price) {
            this.market_price = market_price;
        }

        public boolean isIs_coupon_allowed() {
            return is_coupon_allowed;
        }

        public void setIs_coupon_allowed(boolean is_coupon_allowed) {
            this.is_coupon_allowed = is_coupon_allowed;
        }

        public boolean isIs_allow_credit() {
            return is_allow_credit;
        }

        public void setIs_allow_credit(boolean is_allow_credit) {
            this.is_allow_credit = is_allow_credit;
        }

        public String getGoods_img() {
            return goods_img;
        }

        public void setGoods_img(String goods_img) {
            this.goods_img = goods_img;
        }

        public int getSales_volume() {
            return sales_volume;
        }

        public void setSales_volume(int sales_volume) {
            this.sales_volume = sales_volume;
        }

        public String getEfficacy() {
            return efficacy;
        }

        public void setEfficacy(String efficacy) {
            this.efficacy = efficacy;
        }

        public String getGoods_type() {
            return goods_type;
        }

        public void setGoods_type(String goods_type) {
            this.goods_type = goods_type;
        }

        public double getActivityPrice() {
            return activityPrice;
        }

        public void setActivityPrice(double activityPrice) {
            this.activityPrice = activityPrice;
        }

        public int getSort() {
            return sort;
        }

        public void setSort(int sort) {
            this.sort = sort;
        }
    }
}
