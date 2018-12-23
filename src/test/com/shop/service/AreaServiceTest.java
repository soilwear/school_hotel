package com.shop.service;

import com.shop.BaseTest;
import com.shop.entity.Area;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class AreaServiceTest  extends BaseTest {


    @Autowired
    private  AreaService  areaService;


    @Test
    public  void testGetAreaTest(){

        List<Area>   areaList=areaService.getAreaList();

        assertEquals("北苑",areaList.get(3).getAreaName());




    }

}
