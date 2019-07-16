package com.example.dao;

import com.example.pojo.AllData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AllDataDao {

    List<AllData> getList();


}
