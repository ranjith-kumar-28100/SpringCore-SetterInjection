package inc.codeman.spring.springcore.shoppingcart.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("inc/codeman/spring/springcore/shoppingcart/assignment/config.xml");
		ShoppingCart shoppingCart =(ShoppingCart) ctx.getBean("shoppingcart");
		System.out.println(shoppingCart);		
	}

}
