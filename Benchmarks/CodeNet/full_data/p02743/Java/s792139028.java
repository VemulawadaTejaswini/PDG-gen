import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    long d = c - a - b;
    if((double)(4*a*b)<Math.pow(d,2)){
      System.out.print("Yes");
    } else {
      System.out.print("No");
    }
  }
}