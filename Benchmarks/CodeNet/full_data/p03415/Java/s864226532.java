import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] o = new char[3];
    o[0] = sc.next().charAt(0);
    o[1] = sc.next().charAt(1);
    o[2] = sc.next().charAt(2);
    String ou = new String(o);
    System.out.pritnln(ou);
  }
}