import java.io.*;
import java.util.Scanner;

public class Main {
	  public static void main(int args[]) {
		    Scanner scanner = new Scanner(System.in);
		    

		    String str1 = scanner.nextLine();
            String str2 = scanner.nextLine();

            int A = Integer.parseInt(str1);
            int B = Integer.parseInt(str2);
            
            int num1 = A + B;
        	int num2 = A - B;
        	int num3 = A * B;
        	
        	if(num1 <= num2) {
        		if(num2 <= num3) {
        			System.out.println(num3);
        		} 
        		else {
        			System.out.println(num2);
        		}
        	}
        	else {
        		if(num3 <= num1) {
        			System.out.println(num1);
        		}
        		else {
        			System.out.println(num3);
        		}
        	}scanner.close();
		  }
        	
        	
        }
