package atCoder01;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		double avarage = Math.ceil((a + b)/2);

		System.out.println(avarage);
	}