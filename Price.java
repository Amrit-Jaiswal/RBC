package com.example.bean;

public class Price {
	
	private long bananaPrice;
	private long orangePrice;
	private long applePrice;
	private long lemonPrice;
	private long peachePrice;
	
	public Price(long bananaPrice, long orangePrice,long applePrice, long lemonPrice, long peachePrice){
		this.bananaPrice=bananaPrice;
		this.orangePrice=orangePrice;
		this.applePrice=applePrice;
		this.lemonPrice=lemonPrice;
		this.peachePrice=peachePrice;
	}
	public long getBananaPrice() {
		return bananaPrice;
	}
	public void setBananaPrice(long bananaPrice) {
		this.bananaPrice = bananaPrice;
	}
	public long getApplePrice() {
		return applePrice;
	}
	public void setApplePrice(long applePrice) {
		this.applePrice = applePrice;
	}
	public long getOrangePrice() {
		return orangePrice;
	}
	public void setOrangePrice(long orangePrice) {
		this.orangePrice = orangePrice;
	}
	public long getLemonPrice() {
		return lemonPrice;
	}
	public void setLemonPrice(long lemonPrice) {
		this.lemonPrice = lemonPrice;
	}
	public long getPeachePrice() {
		return peachePrice;
	}
	public void setPeacheprice(long peacheprice) {
		this.peachePrice = peacheprice;
	}
	
}
