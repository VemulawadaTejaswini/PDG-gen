import java.util.Scanner;
 
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    double ra = Math.sqrt(a);
    double rb = Math.sqrt(b);
    double rc = Math.sqrt(c);
    if(ra+rb<rc){
      System.out.print("Yes");
    } else {
      System.out.print("No");
    }
  }
}