package com.shop.dao;

import com.shop.entity.Area;

import java.util.List;

public interface AreaDao {
    /**
     *   列出区域列表
     *
     *   re areaList
     */

    List<Area>  queryArea();
}
