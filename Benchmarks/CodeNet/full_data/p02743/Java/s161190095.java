import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    double ineq = Math.sqrt(c)-Math.sqrt(a)-Math.sqrt(b);
    if(ineq>0){
      System.out.print("Yes");
    } else {
      System.out.print("No");
    }
  }
}