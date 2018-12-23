package com.shop.dao;


import com.shop.BaseTest;
import com.shop.dao.AreaDao;
import com.shop.entity.Area;
import org.apache.ibatis.javassist.ClassPath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;


public class AreaDaoTest  extends BaseTest {
    @Autowired
    private AreaDao areaDao;




    @Test
    public void testQueryArea() {

        List<Area>  areaList  =areaDao.queryArea();

        assertEquals(4,areaList.size());
    }
}
