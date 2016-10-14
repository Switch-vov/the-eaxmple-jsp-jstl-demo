package com.pc.product.service;

import java.util.List;

import com.pc.product.dao.ProductDao;
import com.pc.product.domain.Product;

/**
 * 产品服务类
 * 
 * @author Switch
 * @data 2016年10月14日
 * @version V1.0
 */
public class ProductService {
	public List<Product> findAllProduct() throws Exception {
		return ProductDao.findAllProduct();
	}
}
