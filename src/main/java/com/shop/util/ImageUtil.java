package com.shop.util;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ImageUtil {


    private static String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();

    private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
    private static final Random r = new Random();

    public static String generateThumbnail(CommonsMultipartFile thumbnail, String targetAddr) {


        //随机名
        String realFileName = getRandomFileName();
        //扩展名
        String extension = getFileExtension(thumbnail);
        makeDirPath(targetAddr);

        String relativeAddr = targetAddr + realFileName + extension;
        File dest = new File(PathUtil.getImgBasePath() + relativeAddr);

        try {

            Thumbnails.of(thumbnail.getInputStream()).size(200, 200)
                    .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "/watermark.jpg"))
                            , 0.25f).outputQuality(0.8f).toFile(dest);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return relativeAddr;
    }


    //创建目标路径所涉及的目录 及/home/work/root/xxx.jpg
    //那么home  work  root 这三个文件夹都得自动创建
    private static void makeDirPath(String targetAddr) {
        String realFileParentPath = PathUtil.getImgBasePath() + targetAddr;
        File dirPath = new File(realFileParentPath);
        if (!dirPath.exists()) {

            dirPath.mkdirs();
        }
    }

    //获取输入流的扩展名
    private static String getFileExtension(CommonsMultipartFile cfile) {

        String orginalFileName = cfile.getOriginalFilename();
        return orginalFileName.substring(orginalFileName.lastIndexOf("."));
    }


    /**
     * 生成随机文件名 ,当前年月日小时分钟秒钟  +五位随机数
     *
     * @return
     */
    private static String getRandomFileName() {
         //获取随机五位数
        int rannum = r.nextInt(89999) + 10000;

        String nowTimeStr = sDateFormat.format(new Date());


        return nowTimeStr + rannum;
    }

    public static void main(String[] args) throws IOException {


        String basePath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        Thumbnails.of(new File("D:/ytw.jpg")).size(200, 200)
                .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File(basePath + "/jtwad.jpg"))
                        , 0.25f).outputQuality(0.8f).toFile("D:/ytwasdasfsadf.jpg");


    }
}
