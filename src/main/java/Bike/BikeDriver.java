package Bike;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BikeDriver {

	public static void main(String[] args) {
		ClassPathResource classPathResource=new ClassPathResource("myspring.xml");
		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
		
		bike b=(bike) beanFactory.getBean("mybike");
		b.printBikeDetails();
	}
}
