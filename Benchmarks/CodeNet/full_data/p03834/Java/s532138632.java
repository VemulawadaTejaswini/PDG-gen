import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    
    String answer = s.replace(",", " ");
    System.out.println(answer);
  }
}