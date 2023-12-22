import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    
    int a = stdIn.nextInt();
    int b = stdIn.nextInt();
    int c = stdIn.nextInt();
    
    if (a == b) {
      if (b == c) {
        System.out.println("No");
      } else {
        System.out.println("Yes");
      }
    } else if (b == c) {
      if (a == b) {
        System.out.println("No");
      } else {
        System.out.println("Yes");
      }
    } else if (a == c) {
      if (a == b) {
        System.out.println("No");
      } else {
        System.out.println("Yes");
      }
    } else {
      System.out.println("No");
    }
  }
}