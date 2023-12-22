import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long min = 10000000000000l;
    for(int i = 1; i < Math.sqrt(A)+1; i++){
      if(A%i == 0){
        long B = i + A/i;
        if(B < min){
          min = B;
        }
      }
    }
    System.out.println(min-2);
  }
}