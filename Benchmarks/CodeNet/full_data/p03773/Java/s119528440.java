import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = a+b;
		if(c>=24){
			System.out.println(c-24);
		}
		else{System.out.println(c);}
	}
}