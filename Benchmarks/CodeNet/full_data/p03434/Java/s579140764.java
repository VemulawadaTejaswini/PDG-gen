import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		
		int b = 0;
		int c = 0;
		
		for (int i = 0; i < n; i++) {
			if (i % 2 == 1) {
				b += a[i];
			} else {
				c += a[i];
			}
		}
		
		System.out.println(Math.abs(b-c));
	}
		
}
	
	
