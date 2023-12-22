import java.util.*;
public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		int block = n / (a+b);
		int surplus = n%(a+b);
		
		int result = (block * a) + (surplus<a?surplus:a);
		System.out.println(result);
	}
}