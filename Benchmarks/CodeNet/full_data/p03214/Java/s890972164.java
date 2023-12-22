import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		int total = 0;
		for (int i : num)
			total += i;
		float ave = total / n;

		float[] sa = new float[n];
		for (int i = 0; i < n; i++) {
			sa[i] = ave - num[i];
			if(sa[i] < 0) 
				sa[i] *= -1;
		}
		
		int minsa = 0;
		for (int i = 0; i < n; i++) {
			if(num[i] == ave) {
				System.out.println(i);
				return;
			}
			
			
			if(sa[i] < sa[minsa])
				minsa = i;
		}
		System.out.println(minsa);
	}
}