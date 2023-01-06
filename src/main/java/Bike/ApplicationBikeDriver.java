package Bike;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationBikeDriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
		
		bike b= (bike) applicationContext.getBean("mybike");
		b.printBikeDetails();
		
	}

}
