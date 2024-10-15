package hibernate2entity;

import java.io.Serializable;


@jakarta.persistence.Embeddable
public class Engine implements Serializable{
	
	private double cc;
	private int mileage;
	private String chasisNo;
	public double getCc() {
		return cc;
	}
	public void setCc(double cc) {
		this.cc = cc;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public String getChasisNo() {
		return chasisNo;
	}
	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}
	
	public Engine(double cc, int mileage, String chasisNo) {
		super();
		this.cc = cc;
		this.mileage = mileage;
		this.chasisNo = chasisNo;
	}
	
	public Engine(){
		
	}
	
	

}
