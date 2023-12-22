import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    while( N > 0 ){
    	N -= 7;
    }
    while(N > 0 ){
    	N -= 4;
    }
    if(N == 0) System.out.println("Yes");
    else System.out.println("No"); 
  }
}


