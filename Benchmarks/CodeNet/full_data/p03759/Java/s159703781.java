import java.util.Scanner;

public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int str1 = sc.nextInt();
		int str2 = sc.nextInt();
		int str3 = sc.nextInt();
		
		if(str2 - str1 == str3 - str2){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	  }
	}