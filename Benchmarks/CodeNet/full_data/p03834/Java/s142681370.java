import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String str[] = s.split(",");;
    for(int i = 0 ; i < 3 ; ++i){
      System.out.print(str[i] + " ");
    }

  }
}