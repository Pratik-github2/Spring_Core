package Laptop;

public class laptop {

	private String brand;
	private String name;
	
	laptop(String brand, String name){
		this.brand=brand;
		this.name=name;
	}
	
	public void printlaptopDetails(){
		System.out.println("=====Laptop======");
		System.out.println(brand);
		System.out.println(name);
		
	}
	
}
