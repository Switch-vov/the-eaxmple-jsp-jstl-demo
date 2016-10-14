package com.pc.product.dao;

import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.pc.product.domain.Product;
import com.xiexun.jdbc.JdbcUtils;

/**
 * 产品Dao
 * 
 * @author Switch
 * @data 2016年10月14日
 * @version V1.0
 */
public class ProductDao {
	private static final ThreadLocal<QueryRunner> tLocalQRunber = new ThreadLocal<QueryRunner>() {
		@Override
		protected QueryRunner initialValue() {
			return new QueryRunner(JdbcUtils.getDataSource());
		}
	};

	public static List<Product> findAllProduct() throws Exception {
		String sql = "select * from tbl_product";
		return tLocalQRunber.get().query(sql, new BeanListHandler<Product>(Product.class));
	}
}
