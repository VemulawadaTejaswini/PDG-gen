import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int t = sc.nextInt();
    
    if(X-t >= 0){
    	System.out.println(X-t);
    }else{
    	System.out.println(0);
    }
   
  }
}