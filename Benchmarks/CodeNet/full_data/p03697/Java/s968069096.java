import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = a+b;
		
		if(c<=9) System.out.println(c);
		else System.out.println("error");

	}
}