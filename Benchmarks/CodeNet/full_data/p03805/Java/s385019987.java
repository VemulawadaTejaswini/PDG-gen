import java.util.*;
public class Main {
	static int pass = 0;
	static int a[][];
	static int N;
	static int M;
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		a = new int[M][2];
		for(int i = 0; i < M; i++) {
			a[i][0] = sc.nextInt() - 1;
			a[i][1] = sc.nextInt() - 1;		}
		String str = "";
		for(int i = 1; i < N; i++) {
			str += i;
		}
		permutation(str, "0");
		System.out.println(pass);
	}
	
	public static void permutation(String q, String ans){
	    if(q.length() <= 1) {
	    	String str = ans + q;
	    	boolean flag = true;
	        for(int i = 0; i < str.length() - 1; i++) {
	        	int num1 = Integer.parseInt(str.substring(i, i + 1));
	        	int num2 = Integer.parseInt(str.substring(i + 1, i + 2));
	        	boolean f = false;
	        	for(int j = 0; j < M; j++) {
	        		if(a[j][0] == num1 && a[j][1] == num2) {
	        			f = true;
	        		} else if(a[j][0] == num2 && a[j][1] == num1) {
	        			f = true;
	        		}
	        	}
	        	if(!f) {
	        		flag = false;
	        	}
	        }
	        if(flag) pass++;
	    } else {
	        for (int i = 0; i < q.length(); i++) {
	            permutation(q.substring(0, i) + q.substring(i + 1), ans + q.charAt(i));
	        }
	    }
	}
}
