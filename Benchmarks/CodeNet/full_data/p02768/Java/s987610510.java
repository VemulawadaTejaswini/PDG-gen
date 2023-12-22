import java.util.*;
 
public class Main{
  public static void main(String...args){
	Scanner s = new Scanner(System.in);
    long n = s.nextLong(), a = s.nextLong(), b = s.nextLong();
    long sum = 0;
    long molecule = 1;
    long denominator = 1;
    for(long i = 1; i <= n; i++){
      molecule *= n-(i-1); molecule %= 1000000007;
      denominator *= 1+(i-1); denominator %= 1000000007;
      if(i != a && i != b){
        sum += molecule / denominator sum %= 1000000007;
      }
    }
    System.out.println(sum);
  }
}