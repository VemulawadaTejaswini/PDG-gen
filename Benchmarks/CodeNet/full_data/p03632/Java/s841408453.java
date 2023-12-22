import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
			 int A,B,C,D;
			 String[] s = bf.readLine().split(" ");
			 A = Integer.parseInt(s[0]);
			 B = Integer.parseInt(s[1]);
			 C = Integer.parseInt(s[2]);
			 D = Integer.parseInt(s[3]);
			 if(B<=C||D<=A) {
				 System.out.println(0);
			 }else if(A < C && C < B && B <= D) {
				 System.out.println(B - C);
			 }else if(A < C &&  B > D) {
				 System.out.println(D - C);
			 }else if(A >= C && B <= D) {
				 System.out.println(B - A);
			 }else if(C < A && A < D && D <= B) {
				 System.out.println(D - A);
			 }
		}catch(IOException ioe) {
			ioe.getMessage();
		}
	}
}