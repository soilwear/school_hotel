package com.shop.dao;

import com.shop.BaseTest;
import com.shop.entity.Area;
import com.shop.entity.PersonInfo;
import com.shop.entity.Shop;
import com.shop.entity.ShopCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

public class ShopDaoTest extends BaseTest {


    @Autowired
    private ShopDao shopDao;

    @Test
    public void insertShop() throws Exception {

        Shop shop = new Shop();
        shop.setOwnerId(1L);
        Area area = new Area();
        area.setAreaId(1L);
        ShopCategory sc = new ShopCategory();
        sc.setShopCategoryId(1L);
        shop.setShopName("mytest1");
        shop.setShopDesc("mytest1");
        shop.setShopAddr("testaddr1");
        shop.setPhone("13810524526");
        shop.setShopImg("test1");
        shop.setLongitude(1D);
        shop.setLatitude(1D);
        shop.setCreateTime(new Date());
        shop.setLastEditTime(new Date());
        shop.setEnableStatus(0);
        shop.setAdvice("审核中");
        shop.setArea(area);
        shop.setShopCategory(sc);
        int effectedNum = shopDao.insertShop(shop);
        assertEquals(1, effectedNum);

    }


    @Test
    public void testUpdateShop() throws Exception {


    }

    @Test
    public void queryByShopId() {

        long shopId = 1;
        Shop shop = shopDao.queryByShopId(shopId);
        System.out.println(shop);


    }
}

