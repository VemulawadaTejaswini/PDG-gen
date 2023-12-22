import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 1;
		int i = 1;
		while (m <= n) {
			m = i*i;
			i ++;
		}
		
		System.out.println((i-2) * (i-2));
	}
	
}