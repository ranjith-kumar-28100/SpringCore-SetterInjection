package inc.codeman.spring.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("inc/codeman/spring/springcore/set/setconfig.xml");
		CarDealer carDealer = (CarDealer) ctx.getBean("cardealer");
		System.out.println("Car Dealer Name: "+carDealer.getName());
		System.out.println("Models Available: "+carDealer.getModels());
		System.out.println(carDealer.getModels().getClass().getName());
	}

}
