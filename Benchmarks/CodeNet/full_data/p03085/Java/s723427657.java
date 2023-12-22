import java.util.Scanner;
public class Main {
  	public static void main (String [] args){
      	Scanner sc = new Scanner (System.in);
      	char in = sc.nextInt().charAt(0);
      	if (in == A)
          	System.out.println('T');
      	else if (in == 'T')
          	System.out.println('A');
      	else if (in == 'C')
          	System.out.println('G');
      	else
          	System.out.println('C');
    }
}