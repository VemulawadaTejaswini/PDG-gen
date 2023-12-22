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
          	String ans1 = Integer.toString(P[i]);
          	String ans2 = Integer.toString(Arrays.asList(sorted[P[i]-1]).indexOf(Y[i]) + 1);
          	
          	for (int j = ans1.length(); j < 6; j++) {
            	ans1 = "0" + ans1;
            }
          	for (int j = ans2.length(); j < 6; j++) {
            	ans2 = "0" + ans2;
            }
			System.out.println(ans1+ans2);
        
        }
    } 	
}
