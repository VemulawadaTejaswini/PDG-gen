import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		String t=scan.nextLine();
		int a=scan.nextInt();
		int b=scan.nextInt();
		String h=scan.next();
		if(s.contains(h))
		{
			System.out.println((a-1)+" "+b);
		}
		else 
		{
			System.out.println(a+" "+(b-1));
		}
	}

}
