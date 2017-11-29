//package com.codelang.retrofitrx.rxJava.model;
//
//import java.util.List;
//
///**
// * @author wangqi
// * @since 2017/11/29 09:28
// */
//
//public class Whether {
//
//
//    /**
//     * result : {"realtime":{"wind":{"windspeed":"","direct":"东北风","power":"3级","offset":""},"time":"09:25:01","weather":{"humidity":"74","img":"01","info":"多云","temperature":"12"},"dataUptime":"1511918701","date":"2017-11-29","city_code":"101200101","city_name":"武汉","week":"3","moon":"十月十二"},"life":{"date":"2017-11-29","info":{"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"yundong":["较不宜","有降水，推荐您在室内进行低强度运动；若坚持户外运动，须注意保暖，做好准备活动，携带雨具。"],"ziwaixian":["最弱","属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"],"ganmao":["易发","天冷空气湿度大且昼夜温差也很大，易发生感冒，请注意适当增减衣服。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"wuran":null,"chuanyi":["较冷","建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"]}},"weather":[{"date":"2017-11-29","week":"三","nongli":"十月十二","info":{"dawn":["7","小雨","4","持续无风向","微风","17:22"],"day":["7","小雨","13","持续无风向","3-5级","07:00","出门记得带伞，行走驾驶做好防滑准备"],"night":["7","小雨","4","持续无风向","3-5级","17:21","出门记得带伞，行走驾驶做好防滑准备"]}},{"date":"2017-11-30","week":"四","nongli":"十月十三","info":{"dawn":["7","小雨","4","持续无风向","3-5级","17:21"],"day":["7","小雨","8","持续无风向","微风","07:00","出门记得带伞，行走驾驶做好防滑准备"],"night":["1","多云","4","东北风","微风","17:21","出门记得带伞，行走驾驶做好防滑准备"]}},{"date":"2017-12-01","week":"五","nongli":"十月十四","info":{"dawn":["1","多云","4","东北风","微风","17:21"],"day":["1","多云","12","东北风","微风","07:01"],"night":["7","小雨","4","东北风","微风","17:21"]}},{"date":"2017-12-02","week":"六","nongli":"十月十五","info":{"dawn":["7","小雨","4","东北风","微风","17:21"],"day":["1","多云","13","东南风","微风","07:02"],"night":["1","多云","6","东北风","微风","17:21"]}},{"date":"2017-12-03","week":"日","nongli":"十月十六","info":{"dawn":["1","多云","6","东北风","微风","17:21"],"day":["1","多云","11","东风","微风","07:03"],"night":["1","多云","6","西北风","微风","17:21"]}}],"pm25":{"key":"Wuhan","show_desc":"0","pm25":{"curPm":"199","pm25":"151","pm10":"150","level":"4","quality":"中度污染","des":"应减少外出，外出时佩戴口罩，敏感人群应尽量避免外出"},"dateTime":"2017年11月29日08时","cityName":"武汉"},"isForeign":0}
//     * error_code : 0
//     * reason : Succes
//     */
//
//    private ResultBean result;
//    private int error_code;
//    private String reason;
//
//    public ResultBean getResult() {
//        return result;
//    }
//
//    public void setResult(ResultBean result) {
//        this.result = result;
//    }
//
//    public int getError_code() {
//        return error_code;
//    }
//
//    public void setError_code(int error_code) {
//        this.error_code = error_code;
//    }
//
//    public String getReason() {
//        return reason;
//    }
//
//    public void setReason(String reason) {
//        this.reason = reason;
//    }
//
//    public static class ResultBean {
//        /**
//         * realtime : {"wind":{"windspeed":"","direct":"东北风","power":"3级","offset":""},"time":"09:25:01","weather":{"humidity":"74","img":"01","info":"多云","temperature":"12"},"dataUptime":"1511918701","date":"2017-11-29","city_code":"101200101","city_name":"武汉","week":"3","moon":"十月十二"}
//         * life : {"date":"2017-11-29","info":{"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"yundong":["较不宜","有降水，推荐您在室内进行低强度运动；若坚持户外运动，须注意保暖，做好准备活动，携带雨具。"],"ziwaixian":["最弱","属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"],"ganmao":["易发","天冷空气湿度大且昼夜温差也很大，易发生感冒，请注意适当增减衣服。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"wuran":null,"chuanyi":["较冷","建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"]}}
//         * weather : [{"date":"2017-11-29","week":"三","nongli":"十月十二","info":{"dawn":["7","小雨","4","持续无风向","微风","17:22"],"day":["7","小雨","13","持续无风向","3-5级","07:00","出门记得带伞，行走驾驶做好防滑准备"],"night":["7","小雨","4","持续无风向","3-5级","17:21","出门记得带伞，行走驾驶做好防滑准备"]}},{"date":"2017-11-30","week":"四","nongli":"十月十三","info":{"dawn":["7","小雨","4","持续无风向","3-5级","17:21"],"day":["7","小雨","8","持续无风向","微风","07:00","出门记得带伞，行走驾驶做好防滑准备"],"night":["1","多云","4","东北风","微风","17:21","出门记得带伞，行走驾驶做好防滑准备"]}},{"date":"2017-12-01","week":"五","nongli":"十月十四","info":{"dawn":["1","多云","4","东北风","微风","17:21"],"day":["1","多云","12","东北风","微风","07:01"],"night":["7","小雨","4","东北风","微风","17:21"]}},{"date":"2017-12-02","week":"六","nongli":"十月十五","info":{"dawn":["7","小雨","4","东北风","微风","17:21"],"day":["1","多云","13","东南风","微风","07:02"],"night":["1","多云","6","东北风","微风","17:21"]}},{"date":"2017-12-03","week":"日","nongli":"十月十六","info":{"dawn":["1","多云","6","东北风","微风","17:21"],"day":["1","多云","11","东风","微风","07:03"],"night":["1","多云","6","西北风","微风","17:21"]}}]
//         * pm25 : {"key":"Wuhan","show_desc":"0","pm25":{"curPm":"199","pm25":"151","pm10":"150","level":"4","quality":"中度污染","des":"应减少外出，外出时佩戴口罩，敏感人群应尽量避免外出"},"dateTime":"2017年11月29日08时","cityName":"武汉"}
//         * isForeign : 0
//         */
//
//        private RealtimeBean realtime;
//        private LifeBean life;
//        private Pm25BeanX pm25;
//        private int isForeign;
//        private List<WeatherBeanX> weather;
//
//        public RealtimeBean getRealtime() {
//            return realtime;
//        }
//
//        public void setRealtime(RealtimeBean realtime) {
//            this.realtime = realtime;
//        }
//
//        public LifeBean getLife() {
//            return life;
//        }
//
//        public void setLife(LifeBean life) {
//            this.life = life;
//        }
//
//        public Pm25BeanX getPm25() {
//            return pm25;
//        }
//
//        public void setPm25(Pm25BeanX pm25) {
//            this.pm25 = pm25;
//        }
//
//        public int getIsForeign() {
//            return isForeign;
//        }
//
//        public void setIsForeign(int isForeign) {
//            this.isForeign = isForeign;
//        }
//
//        public List<WeatherBeanX> getWeather() {
//            return weather;
//        }
//
//        public void setWeather(List<WeatherBeanX> weather) {
//            this.weather = weather;
//        }
//
//        public static class RealtimeBean {
//            /**
//             * wind : {"windspeed":"","direct":"东北风","power":"3级","offset":""}
//             * time : 09:25:01
//             * weather : {"humidity":"74","img":"01","info":"多云","temperature":"12"}
//             * dataUptime : 1511918701
//             * date : 2017-11-29
//             * city_code : 101200101
//             * city_name : 武汉
//             * week : 3
//             * moon : 十月十二
//             */
//
//            private WindBean wind;
//            private String time;
//            private WeatherBean weather;
//            private String dataUptime;
//            private String date;
//            private String city_code;
//            private String city_name;
//            private String week;
//            private String moon;
//
//            public WindBean getWind() {
//                return wind;
//            }
//
//            public void setWind(WindBean wind) {
//                this.wind = wind;
//            }
//
//            public String getTime() {
//                return time;
//            }
//
//            public void setTime(String time) {
//                this.time = time;
//            }
//
//            public WeatherBean getWeather() {
//                return weather;
//            }
//
//            public void setWeather(WeatherBean weather) {
//                this.weather = weather;
//            }
//
//            public String getDataUptime() {
//                return dataUptime;
//            }
//
//            public void setDataUptime(String dataUptime) {
//                this.dataUptime = dataUptime;
//            }
//
//            public String getDate() {
//                return date;
//            }
//
//            public void setDate(String date) {
//                this.date = date;
//            }
//
//            public String getCity_code() {
//                return city_code;
//            }
//
//            public void setCity_code(String city_code) {
//                this.city_code = city_code;
//            }
//
//            public String getCity_name() {
//                return city_name;
//            }
//
//            public void setCity_name(String city_name) {
//                this.city_name = city_name;
//            }
//
//            public String getWeek() {
//                return week;
//            }
//
//            public void setWeek(String week) {
//                this.week = week;
//            }
//
//            public String getMoon() {
//                return moon;
//            }
//
//            public void setMoon(String moon) {
//                this.moon = moon;
//            }
//
//            public static class WindBean {
//                /**
//                 * windspeed :
//                 * direct : 东北风
//                 * power : 3级
//                 * offset :
//                 */
//
//                private String windspeed;
//                private String direct;
//                private String power;
//                private String offset;
//
//                public String getWindspeed() {
//                    return windspeed;
//                }
//
//                public void setWindspeed(String windspeed) {
//                    this.windspeed = windspeed;
//                }
//
//                public String getDirect() {
//                    return direct;
//                }
//
//                public void setDirect(String direct) {
//                    this.direct = direct;
//                }
//
//                public String getPower() {
//                    return power;
//                }
//
//                public void setPower(String power) {
//                    this.power = power;
//                }
//
//                public String getOffset() {
//                    return offset;
//                }
//
//                public void setOffset(String offset) {
//                    this.offset = offset;
//                }
//            }
//
//            public static class WeatherBean {
//                /**
//                 * humidity : 74
//                 * img : 01
//                 * info : 多云
//                 * temperature : 12
//                 */
//
//                private String humidity;
//                private String img;
//                private String info;
//                private String temperature;
//
//                public String getHumidity() {
//                    return humidity;
//                }
//
//                public void setHumidity(String humidity) {
//                    this.humidity = humidity;
//                }
//
//                public String getImg() {
//                    return img;
//                }
//
//                public void setImg(String img) {
//                    this.img = img;
//                }
//
//                public String getInfo() {
//                    return info;
//                }
//
//                public void setInfo(String info) {
//                    this.info = info;
//                }
//
//                public String getTemperature() {
//                    return temperature;
//                }
//
//                public void setTemperature(String temperature) {
//                    this.temperature = temperature;
//                }
//            }
//        }
//
//        public static class LifeBean {
//            /**
//             * date : 2017-11-29
//             * info : {"kongtiao":["较少开启","您将感到很舒适，一般不需要开启空调。"],"yundong":["较不宜","有降水，推荐您在室内进行低强度运动；若坚持户外运动，须注意保暖，做好准备活动，携带雨具。"],"ziwaixian":["最弱","属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"],"ganmao":["易发","天冷空气湿度大且昼夜温差也很大，易发生感冒，请注意适当增减衣服。"],"xiche":["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"],"wuran":null,"chuanyi":["较冷","建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"]}
//             */
//
//            private String date;
//            private InfoBean info;
//
//            public String getDate() {
//                return date;
//            }
//
//            public void setDate(String date) {
//                this.date = date;
//            }
//
//            public InfoBean getInfo() {
//                return info;
//            }
//
//            public void setInfo(InfoBean info) {
//                this.info = info;
//            }
//
//            public static class InfoBean {
//                /**
//                 * kongtiao : ["较少开启","您将感到很舒适，一般不需要开启空调。"]
//                 * yundong : ["较不宜","有降水，推荐您在室内进行低强度运动；若坚持户外运动，须注意保暖，做好准备活动，携带雨具。"]
//                 * ziwaixian : ["最弱","属弱紫外线辐射天气，无需特别防护。若长期在户外，建议涂擦SPF在8-12之间的防晒护肤品。"]
//                 * ganmao : ["易发","天冷空气湿度大且昼夜温差也很大，易发生感冒，请注意适当增减衣服。"]
//                 * xiche : ["不宜","不宜洗车，未来24小时内有雨，如果在此期间洗车，雨水和路上的泥水可能会再次弄脏您的爱车。"]
//                 * wuran : null
//                 * chuanyi : ["较冷","建议着厚外套加毛衣等服装。年老体弱者宜着大衣、呢外套加羊毛衫。"]
//                 */
//
//                private Object wuran;
//                private List<String> kongtiao;
//                private List<String> yundong;
//                private List<String> ziwaixian;
//                private List<String> ganmao;
//                private List<String> xiche;
//                private List<String> chuanyi;
//
//                public Object getWuran() {
//                    return wuran;
//                }
//
//                public void setWuran(Object wuran) {
//                    this.wuran = wuran;
//                }
//
//                public List<String> getKongtiao() {
//                    return kongtiao;
//                }
//
//                public void setKongtiao(List<String> kongtiao) {
//                    this.kongtiao = kongtiao;
//                }
//
//                public List<String> getYundong() {
//                    return yundong;
//                }
//
//                public void setYundong(List<String> yundong) {
//                    this.yundong = yundong;
//                }
//
//                public List<String> getZiwaixian() {
//                    return ziwaixian;
//                }
//
//                public void setZiwaixian(List<String> ziwaixian) {
//                    this.ziwaixian = ziwaixian;
//                }
//
//                public List<String> getGanmao() {
//                    return ganmao;
//                }
//
//                public void setGanmao(List<String> ganmao) {
//                    this.ganmao = ganmao;
//                }
//
//                public List<String> getXiche() {
//                    return xiche;
//                }
//
//                public void setXiche(List<String> xiche) {
//                    this.xiche = xiche;
//                }
//
//                public List<String> getChuanyi() {
//                    return chuanyi;
//                }
//
//                public void setChuanyi(List<String> chuanyi) {
//                    this.chuanyi = chuanyi;
//                }
//            }
//        }
//
//        public static class Pm25BeanX {
//            /**
//             * key : Wuhan
//             * show_desc : 0
//             * pm25 : {"curPm":"199","pm25":"151","pm10":"150","level":"4","quality":"中度污染","des":"应减少外出，外出时佩戴口罩，敏感人群应尽量避免外出"}
//             * dateTime : 2017年11月29日08时
//             * cityName : 武汉
//             */
//
//            private String key;
//            private String show_desc;
//            private Pm25Bean pm25;
//            private String dateTime;
//            private String cityName;
//
//            public String getKey() {
//                return key;
//            }
//
//            public void setKey(String key) {
//                this.key = key;
//            }
//
//            public String getShow_desc() {
//                return show_desc;
//            }
//
//            public void setShow_desc(String show_desc) {
//                this.show_desc = show_desc;
//            }
//
//            public Pm25Bean getPm25() {
//                return pm25;
//            }
//
//            public void setPm25(Pm25Bean pm25) {
//                this.pm25 = pm25;
//            }
//
//            public String getDateTime() {
//                return dateTime;
//            }
//
//            public void setDateTime(String dateTime) {
//                this.dateTime = dateTime;
//            }
//
//            public String getCityName() {
//                return cityName;
//            }
//
//            public void setCityName(String cityName) {
//                this.cityName = cityName;
//            }
//
//            public static class Pm25Bean {
//                /**
//                 * curPm : 199
//                 * pm25 : 151
//                 * pm10 : 150
//                 * level : 4
//                 * quality : 中度污染
//                 * des : 应减少外出，外出时佩戴口罩，敏感人群应尽量避免外出
//                 */
//
//                private String curPm;
//                private String pm25;
//                private String pm10;
//                private String level;
//                private String quality;
//                private String des;
//
//                public String getCurPm() {
//                    return curPm;
//                }
//
//                public void setCurPm(String curPm) {
//                    this.curPm = curPm;
//                }
//
//                public String getPm25() {
//                    return pm25;
//                }
//
//                public void setPm25(String pm25) {
//                    this.pm25 = pm25;
//                }
//
//                public String getPm10() {
//                    return pm10;
//                }
//
//                public void setPm10(String pm10) {
//                    this.pm10 = pm10;
//                }
//
//                public String getLevel() {
//                    return level;
//                }
//
//                public void setLevel(String level) {
//                    this.level = level;
//                }
//
//                public String getQuality() {
//                    return quality;
//                }
//
//                public void setQuality(String quality) {
//                    this.quality = quality;
//                }
//
//                public String getDes() {
//                    return des;
//                }
//
//                public void setDes(String des) {
//                    this.des = des;
//                }
//            }
//        }
//
//        public static class WeatherBeanX {
//            /**
//             * date : 2017-11-29
//             * week : 三
//             * nongli : 十月十二
//             * info : {"dawn":["7","小雨","4","持续无风向","微风","17:22"],"day":["7","小雨","13","持续无风向","3-5级","07:00","出门记得带伞，行走驾驶做好防滑准备"],"night":["7","小雨","4","持续无风向","3-5级","17:21","出门记得带伞，行走驾驶做好防滑准备"]}
//             */
//
//            private String date;
//            private String week;
//            private String nongli;
//            private InfoBeanX info;
//
//            public String getDate() {
//                return date;
//            }
//
//            public void setDate(String date) {
//                this.date = date;
//            }
//
//            public String getWeek() {
//                return week;
//            }
//
//            public void setWeek(String week) {
//                this.week = week;
//            }
//
//            public String getNongli() {
//                return nongli;
//            }
//
//            public void setNongli(String nongli) {
//                this.nongli = nongli;
//            }
//
//            public InfoBeanX getInfo() {
//                return info;
//            }
//
//            public void setInfo(InfoBeanX info) {
//                this.info = info;
//            }
//
//            public static class InfoBeanX {
//                private List<String> dawn;
//                private List<String> day;
//                private List<String> night;
//
//                public List<String> getDawn() {
//                    return dawn;
//                }
//
//                public void setDawn(List<String> dawn) {
//                    this.dawn = dawn;
//                }
//
//                public List<String> getDay() {
//                    return day;
//                }
//
//                public void setDay(List<String> day) {
//                    this.day = day;
//                }
//
//                public List<String> getNight() {
//                    return night;
//                }
//
//                public void setNight(List<String> night) {
//                    this.night = night;
//                }
//            }
//        }
//    }
//}
