import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s=sc.next();
    System.out.println(s.subString(0,4)+" "+s.subString(4,12));
  }
}