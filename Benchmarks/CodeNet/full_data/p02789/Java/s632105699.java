import java.util.Scanner;
 
public class Main {
	  public static void main(String[] args){
		    
        System.out.println("Nの値を入力してください");
        int N = new java.util.Scanner(System.in).nextInt();
        
        System.out.println("Mの値を入力してください");
        int M = new java.util.Scanner(System.in).nextInt();
        
        if(N == M){
          System.out.println("yes");
        }
        else
        {System.out.println("No");
        }
     }
 }
