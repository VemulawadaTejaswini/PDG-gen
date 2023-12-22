package question;

import java.util.Scanner;

public class Test003 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		
		String line = sc.nextLine();
		String[] N = line.split(" ");
		int first = Integer.parseInt(N[0]);
		int second = Integer.parseInt(N[1]);
		int third = Integer.parseInt(N[2]);
		
		
		int a=first;
		int b=second;
		int c=third;
		
	
		
		if((a+b==c)||(a+c==b)||(b+c==a)){
			
			System.out.println("Yes");
			
		}else 
			System.out.println("No");
		}
		
	}
