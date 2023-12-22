import java.util.*;
public class Main {

	public static List<String> z;
	
	public static int factorial(int n){
		  return n <= 0 ? 1 : n * factorial(n-1);
	}	
	
	public static void permutation(String q, String ans){
	        // Base Case
	        if(q.length() <= 1) {
	        	z.add(ans + q);
	        }
	        // General Case
	        else {
	            for (int i = 0; i < q.length(); i++) {
	                permutation(q.substring(0, i) + q.substring(i + 1),
	                        ans + q.charAt(i));
	            }
	        }
	    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		z = new ArrayList<>();
		double[] x = new double[N];
		double[] y = new double[N];
		double ans = 0;
		for(int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		String s = "";
		for(int i = 0; i < N; i++)
			s += i;
		permutation(s,"");
		for(int i = 0; i < z.size(); i++) {
			for(int j = 1; j < N; j++) {
				String q = z.get(i);
				int a = Character.getNumericValue(q.charAt(j));
				int b = Character.getNumericValue(q.charAt(j-1));
				ans += Math.pow(Math.pow(x[a]-x[b], 2) + Math.pow(y[a]-y[b], 2), 0.5);
			}
		}
		System.out.println(ans/factorial(N));
		
	}

}