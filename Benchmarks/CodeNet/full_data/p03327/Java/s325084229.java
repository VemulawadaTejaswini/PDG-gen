import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		if(n >= 100){
			System.out.println("ABD");
		}else{
			System.out.println("ABC");
		}
	}

}