import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    boolean b = false;
    
    if( N % 4 == 0 || N % 7 == 0){
    System.out.println("Yes");  
      b = true;
    } else{
    while(N > 0){
      N -= 7;
    if(N % 4 == 0){
      System.out.println("Yes");
      b = true;
        break;
       }
    }
    if(b == false)
      System.out.println("No");
    }
  }
}