import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int count = 3;
		if(a == b) count--;
		if(a == c) count--;
		if(b == c) count--;
		System.out.println(count);
	}
}
