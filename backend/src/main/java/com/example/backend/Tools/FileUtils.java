package com.example.backend.Tools;

import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * @ * 03/11:10 AM
 * @Description:
 */
public class FileUtils {

    //这是本地存入的格式，上传到服务器的格式类似于，"/root/images/pc/"
//    public static String BASE_FOLDER = "D:/images/pc/";

    /**
     * 将文件转换成Byte数组
     *
     * @param pathStr
     * @return
     */
    public static byte[] getBytesByFile(String pathStr) {
//        InputStream fis = null;
//        ByteArrayOutputStream baos = null;
//        try{
//            baos = new ByteArrayOutputStream();
//            fis = new FileInputStream(pathStr);
//            byte[] ch = new byte[1024];
//            int readLen = 0;
//            while ((readLen = fis.read(ch)) != -1) {
//                baos.write(ch, 0, readLen);
//            }
//            return baos.toByteArray();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        finally{
//            try{
//                if (fis != null) {
//                    fis.close();
//                }
//            }catch (IOException e) {}
//            try{
//                if (baos != null) {
//                    baos.close();}
//            }catch (IOException e) {}
//        }
//        return null;
        File file = new File(pathStr);
        try {
            FileInputStream fis = new FileInputStream(file);
            ByteArrayOutputStream bos = new ByteArrayOutputStream(1024);
            byte[] b = new byte[1024];
            int n;
            while ((n = fis.read(b)) != -1) {
                bos.write(b, 0, n);
            }
            fis.close();
            byte[] data = bos.toByteArray();
            bos.close();
            return data;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 将Byte数组转换成文件
     *
     * @param bytes
     * @param filePath
     * @param fileName
     */

    public static void getFileByBytes(byte[] bytes, String filePath, String fileName) {
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;
        File file = null;
        try {
            File dir = new File(filePath);
            if (!dir.exists() && dir.isDirectory()) {// 判断文件目录是否存在
                dir.mkdirs();
            }
            file = new File(filePath + System.getProperty("file.separator") + fileName);
            fos = new FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            bos.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 获取文件后缀
     *
     * @param File
     * @return
     */
    public static String getFileExtension(MultipartFile File) {
        String originalFileName = File.getOriginalFilename();
        return originalFileName.substring(originalFileName.lastIndexOf("."));
    }
}
