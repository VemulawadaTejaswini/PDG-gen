import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int money = sc.nextInt();
		int numberOfTenThousandYen = -1;
		int numberOfFiveThousandYen = -1;
		int numberOfOneThousandYen = -1;
		for(int i = 0; i <= n; i ++) {
			for(int j = 0; j <= n; j++) {
					int total = 10000*i + 5000*j + 1000*(n-i-j);
					if(i+j+(n-i-j) == n && total == money) {
						numberOfTenThousandYen = i;
						numberOfFiveThousandYen = j;
						numberOfOneThousandYen = n-i-j;
						break;
					}
				
			}
		}
		System.out.print(numberOfTenThousandYen);
		System.out.print(" " + numberOfFiveThousandYen);
		System.out.print(" " + numberOfOneThousandYen);
		
	}
}