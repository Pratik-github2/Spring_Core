package Laptop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class laptopDriver {
	public static void main(String[] args) {
		
		ClassPathResource classPathResource=new ClassPathResource("myspring.xml");
		BeanFactory beanFactory= new XmlBeanFactory(classPathResource);
		
		laptop l=(laptop) beanFactory.getBean("mylapi");
		l.printlaptopDetails();
		
	}

}
