package com.shop.util;


/**
 * 图片处理类
 *     返回根路径
 *      根据不同系统设计路径
 *
 */
public class PathUtil {


    private static String seperator = System.getProperty("file.separator");

    public static String getImgBasePath() {

        String os = System.getProperty("os.name");

        String basePath = "";
        if (os.toLowerCase().startsWith("win")) {
            basePath = "D:/project/image";
        } else {
            basePath = "/home/root/image";
        }
        basePath = basePath.replace("/", seperator);

        return basePath;
    }


    public static String getShopImagePath(long shopId) {
        String imagePath = "/upload/item/shop" + shopId + "/";
        return imagePath.replace("/", seperator);
    }
}
