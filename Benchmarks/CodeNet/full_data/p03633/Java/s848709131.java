import java.util.*;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  long N = sc.nextLong();
  long ans=sc.nextLong();
  long tmp;
  for(int i=1;i<N;i++){
    tmp=sc.nextLong();
    ans=ans/gcd(ans,tmp)*tmp;
  }
  System.out.println(ans);
}
public static long gcd(long m, long n) {
  if (n == 0) {
    return m;
  }
  return gcd(n, m % n);
}
}
