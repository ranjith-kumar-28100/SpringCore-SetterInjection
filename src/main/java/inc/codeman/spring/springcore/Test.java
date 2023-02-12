package inc.codeman.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("inc/codeman/spring/springcore/config.xml");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("Employee Id: "+emp.getId());
		System.out.println("Employee Name: "+emp.getName());
		System.out.println("Employee Age: "+emp.getAge());
	}
}
