import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(s.charAt(2)==s.charAt(3)&&s.charAt(4)==s.charAt(5)?"Yes":"No") ;

  }
}