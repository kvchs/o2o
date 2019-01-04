package com.imooc.o2o.service.impl;

import java.io.File;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.imooc.o2o.dao.ShopDao;
import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.enums.ShopStateEnum;
import com.imooc.o2o.service.ShopService;
import com.imooc.o2o.util.PathUtil;

public class ShopServiceImpl implements ShopService{
	
	@Autowired
	ShopDao shopDao;

	@Override
	@Transactional
	public ShopExecution addShop(Shop shop, File shopImg) {
		// TODO Auto-generated method stub
		if (shop==null) {
			return new ShopExecution(ShopStateEnum.NULL_SHOP);
		}
		
		try {
			shop.setEnableStatus(0);
			shop.setCreateTime(new Date());
			shop.setLastEditTime(new Date());
			int effectedNum = shopDao.insertShop(shop);
			if (effectedNum <= 0) {
				throw new RuntimeException("店铺创建失败");
			}else {
				if (shopImg != null) {
				try {
//					存储图片
					addShopImg(shop, shopImg);
//					shop.getShopImg();
				} catch (Exception e) {
					// TODO: handle exception
					throw new RuntimeException("addShopImg error: " + e.getMessage());
				}
				
				//更新店铺图片地址
				effectedNum = shopDao.updateShop(shop);
				if(effectedNum<=0) {
					throw new RuntimeException("更新图片地址失败");
				}
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException("Add Shop Error: " + e.getMessage());
		}
		return null;
	}

	private void addShopImg(Shop shop, File shopImg) {
		// TODO Auto-generated method stub
		// 获取shop图片目录的相对值路径
//		String dest = PathUtil.getS
		
	}

}
