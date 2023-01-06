package Bike;

public class bike {

	private String brand;
	private String name;
	
	
	public  bike(String brand, String name) {
		this.brand=brand;
		this.name=name;
		
	}
	
	public void printBikeDetails() {
	System.out.println("======bike======");
	System.out.println(brand);
	System.out.println(name);
	}
	
}
