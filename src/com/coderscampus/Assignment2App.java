package com.coderscampus;

import java.util.Scanner;

import java.util.Random;

public class Assignment2App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int guesses = 1;
		System.out.println("Pick a number between 1 and 100");
		int answer = 1 + random.nextInt(100);
		int input = collectInput(sc);

		while (guesses <= 4 && input != answer) {
			if (input < answer) {
				System.out.println("Please pick a higher number");
				++guesses;
				input = collectInput(sc);
			} else if (input > answer) {
				System.out.println("Please pick a lower number");
				++guesses;
				input = collectInput(sc);
			}
		}
		if (guesses == 5) {
			System.out.println("You lose!" + "\n" + "The number to guess was: " + answer);
		}
		if (input == answer) {
			System.out.println("You win!");
		}
	}

	public static int collectInput(Scanner sc) { // the point of this method is to collect a guess from the user
		int userInput = sc.nextInt();
		while (userInput < 1 || userInput > 100) {
			System.out.println("Your guess is not between 1 and 100, please try again");
			userInput = sc.nextInt();
		}
		return userInput;
	}
}
