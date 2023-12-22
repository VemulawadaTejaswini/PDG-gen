import java.utill.Scanner;

public class main {
  public static void main(String[] args) {
  
　　Scanner scan = new Scanner(System.in);
　　
　　int r = scan.nextInt();
　　int g = scan.nextInt();
　　int b = scan.nextInt();
　　
　　scan.close();
　　
　　if((r * 100 + g * 10 + b)%4 == 0) {
　　  System.out.print("YES");
　　  
　　} else {
　　  System.out.print("NO");
　　}
　　
　　}
　　
　　}