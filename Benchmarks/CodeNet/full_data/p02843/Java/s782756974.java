import java.util.Scanner;

public class Main{
	public static boolean solve(int n){
		if(n==100||n==101||n==102||n==103||n==104||n==105){
			return true;
			}
		else if(n<100){
			return false;
			}
		
		else return (solve(n-100)||solve(n-101)||solve(n-102)||solve(n-103)||solve(n-104)||solve(n-105));
			}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(solve(n)){
			System.out.println(1);
			}
		else{
			System.out.println(0);
			}
		}
	}