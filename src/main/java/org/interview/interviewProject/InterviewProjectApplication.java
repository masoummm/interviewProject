package org.interview.interviewProject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InterviewProjectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InterviewProjectApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println(".______   .______        ______          __   _______   ______ .___________.    __       _______.    __    __  .______   \n" +
				"|   _  \\  |   _  \\      /  __  \\        |  | |   ____| /      ||           |   |  |     /       |   |  |  |  | |   _  \\  \n" +
				"|  |_)  | |  |_)  |    |  |  |  |       |  | |  |__   |  ,----'`---|  |----`   |  |    |   (----`   |  |  |  | |  |_)  | \n" +
				"|   ___/  |      /     |  |  |  | .--.  |  | |   __|  |  |         |  |        |  |     \\   \\       |  |  |  | |   ___/  \n" +
				"|  |      |  |\\  \\----.|  `--'  | |  `--'  | |  |____ |  `----.    |  |        |  | .----)   |      |  `--'  | |  |      \n" +
				"| _|      | _| `._____| \\______/   \\______/  |_______| \\______|    |__|        |__| |_______/        \\______/  | _|      ");
	}
}
