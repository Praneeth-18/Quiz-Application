package quizApp;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Quiz {

	Scanner scan = new Scanner(System.in);
	void menu() throws IOException {
		int choiceOption;
		AddQuestions addQuestions = new AddQuestions();
		addQuestions.displayOptions();
		choiceOption = scan.nextInt();
		if(choiceOption == 1) {
		System.out.println("Welcome to Quiz!");
		System.out.println("1.General Knowledge");
		System.out.println("2.Science");
		System.out.println("3.History");
		System.out.println("Select topic to play:");

		int topicChoice = scan.nextInt();
		switch(topicChoice) {
		case 1:
			GeneralKnowledge generalKnowledge = new GeneralKnowledge();
			generalKnowledge.questions();
			break;
		case 2:
			Science science = new Science();
			science.questions();
			break;
		case 3:
			History history = new History();
			history.questions();
			break;
		default:
			System.out.println("Enter choice between 1 to 3");
			System.out.println();
			menu();
		}
		}
		else if(choiceOption == 2) {
			addQuestions.questions();
		}
		else {
			System.out.println("Enter a valid choice");
			menu();
		}

	}



}