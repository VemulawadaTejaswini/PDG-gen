import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
      	int N = input.nextInt();
      	int M = input.nextInt();
      	int Q = input.nextInt();
      	int[] start = new int[M];
      	int[] end = new int[M];
      	int[] Qstart = new int[Q];
      	int[] Qend = new int[Q];
      	
      	for (int i = 0; i < M; i++) {
        	start[i] = input.nextInt();
        	end[i] = input.nextInt();
        }
      	for (int i = 0; i < Q; i++) {
        	Qstart[i] = input.nextInt();
        	Qend[i] = input.nextInt();
        }
      	for (int i = 0; i < Q; i++) {
        	int ans = 0;
          	for(int j = 0; j < M; j++) {
            	if (start[j] >= Qstart[i]) {
                	if ( (end[j] <= Qend[i])) {
                    	ans++;
                    }
                }
            }
        	System.out.println(ans);
        }
      	
    } 	
}
