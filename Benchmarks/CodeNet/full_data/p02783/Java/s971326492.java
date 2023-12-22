import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double h = sc.nextShort();
    short a = sc.nextShort();
    System.out.println((int)Math.ceil(h/a));
  }
}