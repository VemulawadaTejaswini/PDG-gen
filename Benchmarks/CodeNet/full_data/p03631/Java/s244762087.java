import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n;
	n=scan.nextInt();
	int s,t;
	s=n%10;
	n/=10;
	n/=10;
	t=n;
	if(s==t)System.out.println("Yes\n");
	else System.out.println("No\n");
}
}
