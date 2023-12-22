import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int len=n/2;
		int p[]=new int[n];
		int cnt=0;
		for(int i=0;i<n;i++) {p[i]=sc.nextInt();}	
		Arrays.sort(p);	
		if(p[len]>p[len-1])System.out.println(p[len]-p[len-1]);
		else System.out.println(0);
	}
}