import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] s = new int[9];
		
		for (int i = 0; i < 9; i++) {
			s[i] = sc.nextInt();
			
		}
		
		if (s[0] + s[4] + s[8] == s[1] + s[5] + s[6] && s[1] + s[5] + s[6] == s[2] + s[3] + s[7]) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
		
}
	
	
