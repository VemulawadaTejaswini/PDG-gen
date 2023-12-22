import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int temp=k;
		int c=0;
		while(temp<=n) {
			temp*=k;
			c++;
		}
		System.out.println(c+1);
	}
}