package com.spring.springboot;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.springboot.dao.BookRepository;
import com.spring.springboot.dao.UserRepository;
import com.spring.springboot.entities.Book;
import com.spring.springboot.entities.User;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

@SpringBootApplication
public class SpringbootApplication {

	private static final String User = null;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
		//UserRepository userRepository = context.getBean(UserRepository.class);
		//BookRepository bookRepository = context.getBean(BookRepository.class);
		/* 
		bookRepository.save(new Book(5,"the story of my life","Hellen Keller"));
        */
		/* 
		-------------------------- Insertion -------------------------------
		User u1 = new User("Shivam Sunderam","Ranchi","sexy");
		System.out.println(u1);
		User u2 = new User("Shivam Sahu","Ranchi","hot");
		System.out.println(u2); 
		userRepository.save(u1);
		userRepository.save(u2);
		List<User> users = new ArrayList<>();
		users.add(new User("Shivam Sunderam","Delhi","sexy"));
		users.add(new User("Shivam Sahu","Delhi","hot"));
		userRepository.saveAll(users);
		*/

		/*
		---------------------------------------- retrieval ------------------------------------------
		 User u3 = userRepository.findById(1).get();
		 System.out.println(u3);
		 Iterable<User> users = userRepository.findAll();
		 Iterator<User> iterator = users.iterator();
		 List<Integer> usersId = new ArrayList<>();
		 usersId.add(11);
		 usersId.add(12);
		 usersId.add(13);
		 usersId.add(14);
		 Iterable<User> usersbyId = userRepository.findAllById(usersId);

		 while(iterator.hasNext())
		 {
			User temp = (User) iterator.next();
			System.out.println(temp);
		 }

		 usersbyId.forEach(user->System.out.println(user));

		 */

        /* 
		------------------------------- updation -------------------------------------------
		 User user1 = userRepository.findById(1).get();
		 ArrayList<Integer> userIds = new ArrayList<>();
		 userIds.add(11);
		 userIds.add(12);
		 userIds.add(13);
		 userIds.add(14);
		 Iterable<User> users = userRepository.findAllById(userIds);

		 user1.setCity("hadoop");
		 user1.setName("hadoop");
		 user1.setStatus("hadoop");

		 users.forEach(e->e.setCity("Dhanbad"));
		 userRepository.save(user1);
		 userRepository.saveAll(users);
        */

		/* 

		---------------------------------- deletion --------------------------------------------
		User user1 = userRepository.findById(1).get();
		userRepository.delete(user1);

		userRepository.deleteById(2);

		ArrayList<Integer> userids = new ArrayList<>();
		 userids.add(7);
		 userids.add(8);
		 userids.add(9);
		 userids.add(10);
		userRepository.deleteAllById(userids);

		ArrayList<Integer> userIds = new ArrayList<>();
		 userIds.add(11);
		 userIds.add(12);
		 userIds.add(13);
		 userIds.add(14);
		 Iterable<User> users = userRepository.findAllById(userIds);

		userRepository.deleteAll(users);

		/* 
        -------------- Derived Query methods / Custom Finder Methods -----------------------
		List<User> users = userRepository.findByIdAndName(3, "Ranchi");
		users.forEach(e->System.out.println((User)e));
		*/


		/* 

		---------------------------- Executing JPQL and Native SQL ---------------------------------
		1. JPQL part
		//System.out.println(userRepository.getAllUser());
		//System.out.println(userRepository.getByStatus("sexy"));
		//System.out.println(userRepository.getByStatus("hot"));

		2. Native SQL part
		System.out.println(userRepository.getAllUsers());
		System.out.println(userRepository.getByStatuss("hot"));

		*/
	}

}
