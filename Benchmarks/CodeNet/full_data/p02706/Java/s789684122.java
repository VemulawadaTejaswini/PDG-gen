import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt(); int m = sc.nextInt(); int homeworkDays = 0;
		int[] arr = new int[m];
		while (m-- > 0) {
			arr[m] = sc.nextInt();
			homeworkDays+=arr[m];
		}
			int vacation = n-homeworkDays;
			System.out.println(vacation >= 0 ? vacation : "-1");
	}
}
