package test;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("channels.xml");
		/*
		MyGateway myGateway= (MyGateway)ctx.getBean("gateWayService");
		myGateway.method("Salut !");*/

		/*ApplicationContext ctx = new ClassPathXmlApplicationContext("database.xml");

		PersonService personService = ctx.getBean(PersonService.class);
		
		Person person = new Person();
		person.setName("Tintin");
		person = personService.createPerson(person);

		System.out.println(person);*/


	}

}
 