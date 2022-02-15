package com.revature.springbootdemo;

import com.revature.springbootdemo.beans.Repositories.CarRepository;
import com.revature.springbootdemo.beans.Repositories.UserRepository;
import com.revature.springbootdemo.beans.models.Cars;
import com.revature.springbootdemo.beans.models.Users;
import com.revature.springbootdemo.beans.utilities.ApplicationContextProvider;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(scanBasePackages = "com.revature.springbootdemo.beans")
public class SpringBootDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootDemoApplication.class, args);

		ApplicationContext context = ApplicationContextProvider.getApplicationContext();
		CarRepository carRepository = context.getBean(CarRepository.class);
		UserRepository userRepository = context.getBean(UserRepository.class);

		// TODO Instantiate instance object and run CRUD on these objects
		Users user = new Users();
		Cars car = new Cars();

		user.setFirstName("Joseph");
		user.setLastName("Smith");
		user.setAge(33);
		userRepository.save(user);

		car.setMake("Dodge");
		car.setModel("Ram");
		car.setColor("White");
		car.setYear(2019);
		carRepository.save(car);
	}

}
