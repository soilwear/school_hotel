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
    public void insertShop() {

        Shop shop = new Shop();
        PersonInfo owner = new PersonInfo();
        Area area = new Area();
        ShopCategory shopCategory = new ShopCategory();

        owner.setUserId(1L);
        area.setAreaId(2L);

        shopCategory.setShopCategoryId(1L);
        shop.setOwner(owner);
        shop.setArea(area);
        shop.setShopCategory(shopCategory);
        shop.setShopName("测试的店铺");
        shop.setOwnerId(1L);
        shop.setShopDesc("测试");
        shop.setShopAddr("测试");
        shop.setPhone("测试");
        shop.setShopImg("测试");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(1);
        shop.setAdvice("审核中");
        int  effectedNum=shopDao.insertShop(shop);
        assertEquals(1 ,effectedNum);
    }




    @Test
    public void testUpdateShop() {
        Shop shop = new Shop();
        shop.setShopId(1L);
        shop.setShopDesc("测试");
        shop.setShopAddr("测试");
        shop.setPhone("测试");
        shop.setShopImg("测试");
        shop.setCreateTime(new Date());
        shop.setEnableStatus(1);
        shop.setAdvice("审核中");
        int  effectedNum=shopDao.insertShop(shop);
        assertEquals(1 ,effectedNum);
    }
}
