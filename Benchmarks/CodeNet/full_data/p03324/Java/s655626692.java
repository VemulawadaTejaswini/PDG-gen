import java.util.Scanner;

public class Main{
	  public static void main(String[] args) {
	      int a = 0,b=0;
	      Scanner sc = new Scanner(System.in);          
			a = sc.nextInt(); 
		    b = sc.nextInt();  
		  System.out.print(b);
		  for(int i=0;i<a;i++) {
			  System.out.print("00");
		  }
		  System.out.println("");
	  }
	}