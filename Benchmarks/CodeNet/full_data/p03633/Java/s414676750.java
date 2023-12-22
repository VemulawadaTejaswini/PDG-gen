import java.util.Scanner;
import java.io.IOException;
class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    long a = scan.nextLong();
    for(int i=0;i<n-1;i++){
      long x = scan.nextLong();
       a = (a / gcd(a,x)) * x;
    }
    System.out.println(a);
  }
  static long gcd(long a , long b){
    if(a ==0) return -1;
    if(a < b) {
      long x = a;
      a = b;
      b = x;
    }
     return (b == 0 || a%b == 0) ? b : gcd(b,a%b);
  }
}
