import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a * t < b ? a * t : b);
	}
}
