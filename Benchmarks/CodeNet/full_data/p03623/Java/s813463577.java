import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int s = Math.abs(x-a);
		int t = Math.abs(x-b);
		
		if(Math.min(s,t)==s){
			System.out.println("A");
		}else{
			System.out.println("B");
		}
		sc.close();
	}
}