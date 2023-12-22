import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		int temp;
		int c = A;
		c *= B;
		while((temp = A%B)!=0){
			A = B;
			B = temp;
		}
		System.out.println(c/B);
	}}