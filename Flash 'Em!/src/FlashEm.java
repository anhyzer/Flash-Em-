/*
Author: Vincent Miller
Date: 18 April 2021
Class: CPSC 1302
Assignment: FINAL PROJECT - Driver/Debug
Description:
Driver for Flash Em.
Debug/Testing code in main for each method.
*/
import java.util.*;
//Create Flash Card objects with question/answer variables.
class FlashCard implements Comparable
{
	//variables
	private String question, answer;
	//constructor
	public FlashCard(String question, String answer)
	{
		this.question = question;
		this.answer = answer;
	}
	//THIS CONTROLS MY OUTPUT
	public String toString()
	{return question+","+answer+"\n";}

	@Override
	public int compareTo(Object o) {
		return 0;
	}
}

public class FlashEm
{
  //main
	public static void main(String[] args)
	{

		//creates array list to hold flash cards
		//initializes array list through readCSV method
		ArrayList<FlashCard> flashcards = FileInOut.readCSV();

    //TESTS Module3 METHODS
		//prints flash cards to terminal
		System.out.println("Original");
		for(FlashCard f : flashcards)
			System.out.println(f);
    //tests shuffle
    Module3.shuffle(flashcards);
    //prints flash cards to terminal
		System.out.println("Shuffled");
    for(FlashCard f : flashcards)
			System.out.println(f);

		Module3.sort(flashcards);
		System.out.println("Sort");
		for(FlashCard f : flashcards)
			System.out.println(f);

		/*
    //TESTS UserEdit METHODS
		//prints flash cards to terminal
		System.out.println("Original");
		for(FlashCard f : flashcards)
			System.out.println(f);
    //tests adding flashcard
		UserEdit.addFlashCard("Do you like apples?","I like turtles.",flashcards);
    //prints flash cards to terminal
		System.out.println("Added");
		for(FlashCard f : flashcards)
			System.out.println(f);
    //tests removing flash cards
    UserEdit.removeFlashCard(5,flashcards);
    //prints flash cards to terminal
		System.out.println("Removed");
    for(FlashCard f : flashcards)
			System.out.println(f);
    //tests editing flash cards
    UserEdit.editFlashCardFile(5,"Real Question","Real Answer", flashcards);
    //prints flash cards to terminal
		System.out.println("Edited");
    for(FlashCard f : flashcards)
			System.out.println(f);
		*/

		//writes flashcards to CSV
		//FileInOut.writeCSV(flashcards);

	}
}
