import java.util.*;
 
public class Main{
  	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextlnt();
      int b = sc.nextlnt();
      int output = (a * b) % 2;
      
      if(output == 0) {
        System.out.print("Even");
      }
      else{
        System.out.print("Odd");
      }
    }
}
