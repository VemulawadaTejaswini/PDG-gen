import java.util.Scanner;
public class Main{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    
    int c = scan.nextInt();
    double ans = 0;
    for(int i=0;i<c;c++){
      double t = scan.nextInt();
      ans += 1.0/t;
    }
    
    System.out.println(1.0/t);
  }
}