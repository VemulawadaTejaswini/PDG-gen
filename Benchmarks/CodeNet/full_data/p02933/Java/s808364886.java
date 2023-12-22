import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
    String s =sc.next();
    if(a<32000)
      System.out.println("red");
    else
      System.out.println(s);
  }
}