package Laptop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppDriver {
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("myspring.xml");
		
		laptop l=(laptop) applicationContext.getBean("mylapi");
		l.printlaptopDetails();
	}

}
