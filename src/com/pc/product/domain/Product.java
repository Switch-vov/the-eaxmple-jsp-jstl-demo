package com.pc.product.domain;

/**
 * 产品Bean
 * 
 * @author Switch
 * @data 2016年10月14日
 * @version V1.0
 */
public class Product {
	private Integer pid;
	private String pname;
	private String price;
	private String pdesc;

	public Product() {
		
	}
	
	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getPdesc() {
		return pdesc;
	}

	public void setPdesc(String pdesc) {
		this.pdesc = pdesc;
	}
}
