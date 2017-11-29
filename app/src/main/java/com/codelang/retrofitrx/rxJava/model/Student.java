package com.codelang.retrofitrx.rxJava.model;

/**
 * @author wangqi
 * @since 2017/11/28 19:56
 */

public class Student extends HttpResponse {


    /**
     * jsonData : {"nick":"wangqi","gender":1}
     */

    private JsonDataBean jsonData;

    public JsonDataBean getJsonData() {
        return jsonData;
    }

    public void setJsonData(JsonDataBean jsonData) {
        this.jsonData = jsonData;
    }

    public static class JsonDataBean {
        /**
         * nick : wangqi
         * gender : 1
         */

        private String nick;
        private int gender;

        public String getNick() {
            return nick;
        }

        public void setNick(String nick) {
            this.nick = nick;
        }

        public int getGender() {
            return gender;
        }

        public void setGender(int gender) {
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "JsonDataBean{" +
                    "nick='" + nick + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "jsonData=" + jsonData +
                '}';
    }
}
