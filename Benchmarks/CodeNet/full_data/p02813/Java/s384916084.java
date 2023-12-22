import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static int count = 0;
	public static int cnd = 0;
	public static void permutation(String q, String ans, String p){
        if(q.length() <= 1) {
			count++;
			if(p.equals(ans+q)){
				cnd = count;
			}
        }
        
        else {
            for (int i = 0; i < q.length(); i++) {
                permutation(q.substring(0, i) + q.substring(i + 1),
                        ans + q.charAt(i), p);
            }
        }
    }
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int N = s.nextInt();
	String a = "";
	String b = "";

	for(int i = 0; i < N; i++){
		a = a + s.next();
	}
	for(int i = 0; i < N; i++){
		b = b + s.next();
	}
	String first = "";
	for(int i = 1; i <= N; i++){
		first = first + String.valueOf(i);
	}
	
	int countA = 0;
	int countB = 0;
	permutation(first, "", a);
	countA = cnd;
	count = 0;
	permutation(first, "", b);
	countB = cnd;

	System.out.println(Math.abs(countA-countB));
    
  }
}