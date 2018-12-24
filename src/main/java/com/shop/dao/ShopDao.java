package com.shop.dao;

import com.shop.entity.Shop;

public interface ShopDao {


    /**
     * 新增店铺
     * @param shop
     * @return
     */
    int insertShop(Shop  shop);

    /**
     * 更新店铺
     * shop
     */

    int  updateShop(Shop shop);


}
