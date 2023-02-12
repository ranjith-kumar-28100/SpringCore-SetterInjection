package inc.codeman.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("inc/codeman/spring/springcore/properties/propertiesconfig.xml");
		CountriesAndLanguages cal =(CountriesAndLanguages) ctx.getBean("cal");
		System.out.println(cal);		
	}

}
