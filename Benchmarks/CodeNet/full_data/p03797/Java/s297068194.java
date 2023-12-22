import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int count=0;
		m+=2*n;
		count+=m/4;
		System.out.println(count);
	}
}