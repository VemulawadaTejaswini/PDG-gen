import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int count = 0;
		int prev = sc.nextInt();
		int curr = sc.nextInt();
		for (int i = 2; i < n; i++) {
			int next = sc.nextInt();
			if(curr < prev && curr > next)count++;
			else if(curr > prev && curr < next)count++;
			prev = curr;
			curr = next;
		}
		System.out.println(count);
		
	}

}
