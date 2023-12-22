import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		
		char[] c = w.toCharArray();
		Arrays.parallelSort(c);
		
		int check = 0;
		for(int i=0;i<c.length;i++) {
			if(i%2 == 0) {
				check += c[i];
			}else {
				check -= c[i];
			}
		}
		
		if(check == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		sc.close();
	}

}
