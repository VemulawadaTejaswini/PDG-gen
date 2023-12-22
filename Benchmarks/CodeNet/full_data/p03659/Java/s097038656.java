import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int[] b = new int[a];
		int min =2147483647;
		int sum1 = 0;
		int sum2 = 0;
		int hen = 1;
		
		for (int i = 0; i < a; i++) {
			b[i] = sc.nextInt();
		}
		
		for (int i = 0; i < a-1; i++) {
			for (int x = 0; x < hen; x++) {
				sum1 += b[x];
			}
			
			for (int y = a-1; y < a-hen; y--) {
				sum2 += b[y];
			}
			hen ++;
			if (min >= Math.abs(sum1-sum2)) {
				min = Math.abs(sum1-sum2);
			}
			sum1 = 0;
			sum2 = 0;
		}
		
		System.out.println(min);
	}
}