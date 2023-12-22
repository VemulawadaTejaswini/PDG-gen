import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    long a = 0;
    long b = 0;
    long m = n;

    for(int i=1 ; i*i<=n ; i++){
      if(n%i==0){
        a = i-1;
        b = n/i-1;
        m = Math.min(n,a+b);
      }
    }
    System.out.println(m);
  }
}
