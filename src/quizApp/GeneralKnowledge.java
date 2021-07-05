package quizApp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GeneralKnowledge {
	Scanner scan = new Scanner(System.in);
	void questions() throws IOException {
		FileReader fileReader = new FileReader("gkQuestions.txt");
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String answer;
		String continueChoice;
		int score = 0;
		int total = 0;
		String question = bufferedReader.readLine();
		while(!(question.isEmpty()) && question != null) {//not End of file
			System.out.println(question);
			for(int i = 0; i < 4; i++) {
				System.out.println(bufferedReader.readLine());
			}
			System.out.println("Enter correct option:");
			answer = scan.nextLine();
			total++;
			if(answer.equalsIgnoreCase(bufferedReader.readLine())) {
				score ++;
				System.out.println("Correct answer");
				System.out.println();
			}
			else {
				System.out.println("Incorrect answer");
				System.out.println();
			}
			question = bufferedReader.readLine();
		}
		System.out.println("Your score is : " + score + " / " + total);

		System.out.println("Do you want to play another quiz? (y/n)");
		continueChoice = scan.nextLine();
		if(continueChoice.equalsIgnoreCase("y")) {
			Quiz quiz = new Quiz();
			quiz.menu();
		}
		else {
			System.out.println("Game over!!!");
			System.exit(0);
		}

	}

}

