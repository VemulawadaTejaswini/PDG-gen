import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int[][] letters = new int[number][26];
		int[] minletters = new int[26];
		for (int i = 0; i < number; i++) {
			String line = sc.next();
			for (int j = 0; j < line.length(); j++) {
				letters[i][(int)line.charAt(j)-97]++;
			}
		}
		for (int column = 0; column < 26; column++) {
			int smallest = 0;
			for (int row = 0; row < number; row++) {
				if (row == 0) {
					smallest = letters[row][column];
				}
				if (letters[row][column] < smallest) {
					smallest = letters[row][column];
				}
			}
			minletters[column] = smallest;
		}
		for (int index = 0; index < 26; index++) {
			for (int times = 0; times < minletters[index]; times++) {
				System.out.print((char)(index+97));
			}
		}
	}
}
