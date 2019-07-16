package com.example.service.impl;

import com.example.dao.AllDataDao;
import com.example.pojo.AllData;
import com.example.service.AllDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AllDataServiceImpl implements AllDataService {

//    @Autowired
    @Resource
    AllDataDao allDataDao = null;

    @Override
    public List<AllData> getList() {
        return allDataDao.getList();
    }
}
