import java.util.*;

public class Main{
	
	static int countP = 0;
	static int countQ = 0;
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int P = 0;
		for(int i = 0; i < N; i++){
			P *= 10;
			P += sc.nextInt();
		}
		int Q = 0;
		for(int i = 0; i < N; i++){
			Q *= 10;
			Q += sc.nextInt();
		}
		
		StringBuffer seed = new StringBuffer("");
		for(int i = 0; i < N; i++){
			seed.append((i+1));
		}
		
		permutation(seed.toString(), "", P, Q);
		
		System.out.println(Math.abs((countP - countQ)));
	}
	
    public static void permutation(String q, String ans, int P, int Q){
        // Base Case
        if(q.length() <= 1) {
        	if(Integer.valueOf(ans + q) > P)
        		countP++;
        	if(Integer.valueOf(ans + q) > Q)
        		countQ++;
        }
        // General Case
        else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1),
                        ans + q.charAt(i), P, Q);
            }
        }
    }
}