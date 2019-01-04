package com.imooc.o2o.util;

public class PathUtil {
	
	public static String getImgBasePath() {
		String os = System.getProperty("os.name");
		String basePath="E:\\学习垃圾文件\\img";
//		if(os.toLowerCase().startsWith("win")) {
//			basePath="D:/project"
//		}else {
//			
//		}
		return basePath;
 	}

}
