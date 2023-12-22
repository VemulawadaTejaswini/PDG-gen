import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String s = sc.next();
    String answer ="red";
    if(a>=3200){
      answer=s;
    }
    System.out.println(answer);
  }
}