package beginner153.problemA;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int h = sc.nextInt();
			int a = sc.nextInt();
			
			System.out.println(1 + h/a);
		}
	}
}