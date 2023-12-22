import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int exit = n % 500;
		if(exit > a){
		System.out.println("No");	
		}else{
		System.out.println("Yes");
		}
	}
}