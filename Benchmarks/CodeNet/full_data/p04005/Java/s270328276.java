import java.util.*;
import java.math.*;
import java.lang.String;
import java.lang.System;
import java.lang.reflect.Array;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int[] red = new int[3];
		int[] blue = new int[3];
		int max = a * b * c;
		
		red[0] = a * b * (c / 2);
		red[1] = b * c * (a / 2);
		red[2] = c * a * (b / 2);
		
		for (int i = 0; i < 3; i++) {
			blue[i] = max - red[i];
		}
		
		int answer = Math.abs(red[0] - blue[0]);
		for (int i = 1; i < 3; i++) {
			int kari = Math.abs(red[i] - blue[i]);
			if (answer > kari) {
				answer = kari;
			}
		}
		
		System.out.println(answer);
		
		
	}
}
