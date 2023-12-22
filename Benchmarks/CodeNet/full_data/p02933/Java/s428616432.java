import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    String s = sc.nextLine();
    int n = s.length();
    if(2800<=a && a<5000 && 1<=n && n<=10){
      if(a>3200){
        System.out.println(s);
      }else{
        System.out.println("red");
      }
    }
  }
}