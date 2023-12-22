import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int c, d;
		if ((A+B) > N) {
		  d = (A + B) - N;
		}
		if(A > B){
		  c = B;
		}else{
		  c = A;
		}
		System.out.println(c + " " + d);
	}
}