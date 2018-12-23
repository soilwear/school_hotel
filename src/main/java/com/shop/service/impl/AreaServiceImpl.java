package com.shop.service.impl;

import com.shop.dao.AreaDao;
import com.shop.entity.Area;
import com.shop.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaDao areaDao;
    @Override
    public List<Area> getAreaList() {
        return  areaDao.queryArea();
    }
}
