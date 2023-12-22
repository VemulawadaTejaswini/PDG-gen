import java.Util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    
    if(a/b==0){
      System.out.println(a+b);
    }else{
      System.out.println(b-a);
    }
  }
}