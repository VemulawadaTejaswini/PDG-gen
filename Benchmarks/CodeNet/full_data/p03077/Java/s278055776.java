import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static String ans="Yay!";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Map<Long,Integer>map=new HashMap<>();
		long n=sc.nextLong();
		long a[]=new long[5];
		for(int i=0;i<5;i++) a[i]=sc.nextLong();
		Arrays.sort(a);
		System.out.println(n/a[0]+5);
	}
}
