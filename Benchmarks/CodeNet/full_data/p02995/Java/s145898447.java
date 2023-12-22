import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong() - 1;
    long b = sc.nextLong();
    int c = sc.nextInt();
    int d = sc.nextInt();
    long x = a - (a/c) - (a/d) +(a / lcm(c,d));
    long y = b - (b/c) - (b/d) + (b/lcm(c,d));
    System.out.println(y - x);
  }
  public static long lcm(int a, int b){
    return (long)a * b / gcd(a , b);
  }
  public static int gcd(int a, int b){
   if(a % b == 0){
     return b;
   }
    return gcd(b , a % b);
  }
}