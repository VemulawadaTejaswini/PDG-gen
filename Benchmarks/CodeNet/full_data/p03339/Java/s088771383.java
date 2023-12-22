import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		  Scanner sc = new Scanner(System.in);
		  int N = sc.nextInt();
		  String S = sc.next();
		  sc.close();
		  
		  int answer = N;
		  
		  int[] a = new int[N];
		  if(S.charAt(0) == 'W') a[0] = 1;
		  
		  for(int i = 1; i < N; i++) {
			  if(S.charAt(i) == 'W') a[i] = a[i - 1] + 1;
			  else a[i] = a[i - 1];
		  }
		  		  
		  for(int i = 0; i < N; i++) {
			  int count;
			  if(i == 0) {
				  count = (N - 1) - (a[N - 1] - a[0]);
			  }else if(i == N - 1) {
				  count = a[N - 2];
			  }else {
				  count = a[i - 1] + ((N - 1 - i)- (a[N - 1] - a[i]));
			  }
			  answer = Math.min(answer, count);
		  }
		  
		  System.out.println(answer);
	      System.exit(0);
	    }
}