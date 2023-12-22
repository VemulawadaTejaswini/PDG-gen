import java.util.*;

public class Main{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int b=sc.nextInt();
		int i=0;
		while(n>0){
			n=n/b;
			i++;
		}
		System.out.println(i);
	}
}