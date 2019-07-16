package com.example.api;

import java.util.HashMap;

public class MyResponse {

    int status = 100;
    String info = "";
    static String source = "k8sDemo";
    long startTime;
    long useTime;

    HashMap<String,Object> data = new HashMap<>();


    public static MyResponse getInstance(){
        MyResponse response = new MyResponse();
        response.startTime = System.currentTimeMillis();
        return response;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public static String getSource() {
        return source;
    }

    public static void setSource(String source) {
        MyResponse.source = source;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getUseTime() {
        return useTime;
    }

    public void setUseTime(long useTime) {
        this.useTime = useTime;
    }

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }
}
