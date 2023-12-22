import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a = Integer.parseInt(sc.next()); //Aの値段
		int b = Integer.parseInt(sc.next()); //Bの値段
		int c = Integer.parseInt(sc.next()); //ABの値段
		System.out .println(a+b+c);
	}
}