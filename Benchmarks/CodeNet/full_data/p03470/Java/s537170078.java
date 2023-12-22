
import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int i;
		Integer a[]=new Integer[x];
		for(i=0;i<x;++i) {
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		for(i=0;i<x-1;++i) {
			if(a[i]==a[i+1]||a[i]==a[i+2]) {
				--x;
			}
		}
		System.out.println(x);
		
	}

}

