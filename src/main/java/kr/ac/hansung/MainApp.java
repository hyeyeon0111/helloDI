package kr.ac.hansung;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		
		// Create container
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("kr/ac/hansung/conf/animal.xml");
		
		// Get bean from container
		PetOwner person = (PetOwner) context.getBean("id_petOwner");
		person.play();
		
		context.close();
	}

}
