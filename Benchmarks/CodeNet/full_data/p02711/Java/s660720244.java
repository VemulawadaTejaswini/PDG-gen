import java.util.*;
 public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();
      int a,b,c;

      a = N/100;
      b = N/10%10;
      c = N%10;

      if(a == 7 || b == 7 || c == 7){
         System.out.println("yes");
      }else{
         System.out.println("no");
      }
     
   }
 }
