
//package practice;

import java.util.*;

import java.io.*;
import java.math.*;

public class Main {

	public static void main(String args[]) throws Exception {
		Scanner scan = new Scanner(System.in);
		int balls = scan.nextInt();
		int[] values = new int[balls];
		for (int i = 0; i < balls; i++) {
			values[i] = scan.nextInt();
		}

		int[] combos = new int[balls];
		for (int k = 0; k < balls; k++) {
			combos[values[k] - 1]++;
		}
		
		
		for (int i = 0; i < balls; i++) {
			int sum = 0;
			combos[values[i] - 1]--;
			for (int k = 0; k < balls; k++) {
				sum += (combos[k] * (combos[k] - 1)) / 2;
			}
			combos[values[i] - 1]++;
			System.out.println(sum);
		}

	}
}
