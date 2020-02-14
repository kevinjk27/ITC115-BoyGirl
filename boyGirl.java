/*
 * Kevin Kantono
 * 02/10/2020
 */

import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class boyGirl {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("boysgirls.txt"));
		double sum = 0.0;
		int count = 0;
		int boysNum = 0;
		int boysScore = 0;
		int girlsNum = 0;
		int girlsScore = 0;
		while (input.hasNext()) {
			String name = input.next();
			int number = input.nextInt();
			count++;
			if (count % 2 == 1) {
				boysNum++;
				boysScore = number + boysScore;
			} else if (count % 2 == 0) {
				girlsNum++;
				girlsScore = number + girlsScore;
			}

		}
		System.out.println("There are: " + boysNum + " boys and " + girlsNum + " girls");
		System.out.println("The difference between boys' and girls' sums: " + Math.abs(boysScore - girlsScore));
	}
}
