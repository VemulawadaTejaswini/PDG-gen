import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a%b!=0 && b%a!=0 && b%c!=0)System.out.println("YES");
		else System.out.println("NO");
	}

}