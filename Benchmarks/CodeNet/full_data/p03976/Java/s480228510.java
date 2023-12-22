import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] initial = new int[26];
		int sum = 0;

		for(int i=0; i<n; i++){
			String s = sc.next();
			initial[s.charAt(0)-'A']++;
		}

		for(int i=0; i<26; i++){
			sum += (initial[i]>n/k)? n/k : initial[i];
			if(i==25&&sum%k!=0){
				n = sum;
				sum = 0;
				i = -1;
			}
		}

		System.out.println(sum/k);
	}
}