import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int sum=a*100+b*10+c;
		if((a>=1&&a<=9)||(b>=1&&b<=9)||(c>=1&&c<=9))
		{if(sum%4==0)
		 System.out.println("YES");
		 else System.out.println("NO");
		}
	}
}
