package com.example.controller;

import com.example.api.MyResponse;
import com.example.pojo.AllData;
import com.example.service.AllDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class AllDataController {


    @Autowired
    AllDataService allDataService;

    @RequestMapping("toIndex")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("toOne")
    public String toOne(){
        return "one";
    }

//    @ResponseBody
    @RequestMapping("getList")
    public MyResponse getList(){
        MyResponse response = new MyResponse();
        HashMap map = new HashMap();
        List<AllData> list = allDataService.getList();
        map.put("data",list);
        response.setData(map);
        response.setStatus(200);
        response.setInfo("success");
        return response;
    }





}
