import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      int k = sc.nextInt();
      
      int a = n / k;
      int b = n % k;
      System.out.println(a-b);
    
      
    	  
      
    }
 }