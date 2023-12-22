import java.util.*;

public class Main {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
      	int N = input.nextInt();
      	int M = input.nextInt();
      	int[] P = new int[M];
      	int[] Y = new int[M];
      	Integer[][] sorted = new Integer[N][M];
      
      	for (int i = 0; i < N; i++) {
        	Arrays.fill(sorted[i], 100000000);
        }
      
      	for (int i = 0; i < M; i++) {
          	P[i] = input.nextInt();
          	Y[i] = input.nextInt();
          	
          	sorted[P[i]-1][i] = Y[i];
        }
      	for (int i = 0; i < N; i++) {
        	Arrays.sort(sorted[i]);
        }
      
      	for (int i = 0; i < M; i++) {
          	String ans1 = "000000";
          	String ans2 = "000000";
          	String val1 = Integer.toString(P[i]);
          	String val2 = Integer.toString(Arrays.asList(sorted[P[i]-1]).indexOf(Y[i]) + 1);
          	ans1 = ans1.substring(0, 6 - val1.length()) + val1;
          	ans2 = ans2.substring(0, 6 - val2.length()) + val2;
			System.out.println(ans1+ans2);
        }
    } 	
}
