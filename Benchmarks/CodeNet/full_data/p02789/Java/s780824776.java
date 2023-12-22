import java.util.Scanner;
 
public class Main {
	  public static void main(String[] args){
		    
        System.out.println("Nの値を入力してください");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        System.out.println("Mの値を入力してください");
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        
        if(N == M){
          System.out.println("yes");
        }
        else
        {System.out.println("No");
        }
     }
 }