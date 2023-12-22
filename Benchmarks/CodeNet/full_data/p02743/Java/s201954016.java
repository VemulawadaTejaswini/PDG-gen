import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long c = sc.nextLong();
    if(4*a*b<(int)Math.pow(c-a-b,2)){
      System.out.print("Yes");
    } else {
      System.out.print("No");
    }
  }
}