import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String S = sc.next();
      
      int a =S.charAt(2);
      int b =S.charAt(3);
      int c =S.charAt(4);
      int d =S.charAt(5);
      
      if(a==b && c==d){
	System.out.println("Yes");
      }
      else{
       System.out.println("No");
      }
    }
}