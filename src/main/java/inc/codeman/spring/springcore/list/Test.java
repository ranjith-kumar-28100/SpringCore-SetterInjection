package inc.codeman.spring.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("inc/codeman/spring/springcore/list/listconfig.xml");
		Hospital hospital = (Hospital) ctx.getBean("hospital");
		System.out.println("Hospital Name: "+hospital.getName());
		System.out.println("Departments in the Hospital: "+hospital.getDepartments());
		System.out.println(hospital.getDepartments().getClass());
	}

}
