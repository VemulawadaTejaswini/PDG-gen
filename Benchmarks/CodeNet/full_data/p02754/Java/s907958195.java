import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = (long)Math.pow(10,18);
    long num = 0;
    long count = 0;

    for(long i=c ; i>0 ; i--){
      num = num + a*i;
    }
    String s = String.valueOf(num);

    for(int i=0 ; i<n ; i++){
      if(s.charAt(i)=='a'){
        count++;
      }
    }
    System.out.println(count);
  }
}
