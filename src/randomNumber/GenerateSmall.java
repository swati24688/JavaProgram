package randomNumber;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateSmall {

	public static void main(String args[]) {
		// create array of int that will store 500 random numbers.
		int[] randomNums = new int[500];

		// generate 500 random numbers and store in above array
		Random rnum = new Random();
		for (int i = 0; i < randomNums.length; i++) {
			randomNums[i] = rnum.nextInt(1000);
		}

		System.out.println("Enter the smallest number you would like to print.");
		Scanner scan = new Scanner(System.in);
		int inputIndex = scan.nextInt();

		// Sort the array in ascending order... eg.g 1,2,3,4,5,6,7,.....
		Arrays.sort(randomNums);

		System.out.println(inputIndex + "th smaller number is " + randomNums[inputIndex - 1]);

	}

}
