import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    
    int count = 0;
    while(A <= B){
      A *= 2;
      count++;
    }
    System.out.println(count);
  }
}