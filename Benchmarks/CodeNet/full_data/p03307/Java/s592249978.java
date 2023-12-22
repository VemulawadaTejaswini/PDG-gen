import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//A
		int n = sc.nextInt();
		if(n%2 == 0)
			System.out.println(n);
		else
			System.out.println(n*2);
	}
}
