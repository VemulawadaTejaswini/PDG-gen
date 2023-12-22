import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		double X = sc.nextDouble(), Y = sc.nextDouble();
		System.out.println((int)(Math.log(Y / X) / Math.log(2)) + 1);
	}
}