package hibernate2entity;
import java.util.Objects;

import jakarta.persistence.Id;

@jakarta.persistence.Entity
public class Car{
	
	@Id
	private int carId;
	private String color;
	private String brand;
	private double price;
	
	@jakarta.persistence.Embedded
	private Engine e;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Engine getE() {
		return e;
	}

	public void setE(Engine e) {
		this.e = e;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, color, e, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(color, other.color) && Objects.equals(e, other.e)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}

	public Car(String color, String brand, double price, Engine e) {
		super();
		this.color = color;
		this.brand = brand;
		this.price = price;
		this.e = e;
	}
	
	public Car() {
		
	}
	
	

}
