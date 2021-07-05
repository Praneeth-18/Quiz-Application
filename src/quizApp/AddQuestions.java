package quizApp;

import java.util.Scanner;

public class AddQuestions {
	Scanner scan = new Scanner(System.in);
	void displayOptions() {
		System.out.println();
		System.out.println("Select your choice: ");
		System.out.println("======================");
		System.out.println("1.Play quiz");
		System.out.println("2.Add questions");
		System.out.println("Enter your choice: ");
	}
	void questions() {
		int topicChoice;
		System.out.println();
		System.out.println("Select the topic to which you wish to add questions: ");
		System.out.println("=====================================================");
		System.out.println("1.General Knowledge");
		System.out.println("2.Science");
		System.out.println("3.History");
		System.out.println("Enter your choice: ");
		topicChoice = scan.nextInt();
		addQues(topicChoice);
		
	}
	void addQues(int choice) {
		if(choice == 1) {
			//add to gk file
		}
		else if(choice == 2) {
			//add to science file
		}
		else if(choice == 3) {
			//add to history file
		}
		else {
			System.out.println("Enter valid choice");
			questions();
		}
		
	}
}
