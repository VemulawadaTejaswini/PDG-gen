import java.util.Arrays;
import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
      long n = sc.nextLong();
      long k = sc.nextLong();
      int count =0;
      if(n>k){
        n = n%k;
      }
      while(true){
        if(count==0){
          n = Math.abs(n-k);
        }else{
          if(n>Math.abs(n-k)){
            n=Math.abs(n-k);
          }else{
            break;
          }
        }
        count=1;
      }
      System.out.println(n);
    }
}
