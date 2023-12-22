import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdIn = new Scanner(System.in);
		
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		int []a = new int [N];
		
		for ( int j = 0; j < a.length  ;j++) 
			  a[j] = j + 1;
		
		int []L = new int [M];
		int []R = new int [M];
		
		for (int i = 0; i < M ; i++) {
		  L[i] = stdIn.nextInt();
		  R[i] = stdIn.nextInt();
		  
		  for(int j = 0; j < N ; j++) {
			if (a[j] < L[i] || a[j] > R[i]) 
				a[j] = 0;
			
		  }
		}
		int sum = 0;
		for(int j = 0; j < N ; j++) {
			if (a[j] > 0)
				sum += 1;
		}
		System.out.println(sum);
	}
		

}
