import java.util.*;
public class Main{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  String s = sc.next();
  int count = 0;
  System.out.print(s.charAt(0));
  for (int i = 1; i < s.length()-1; i++){
    count++;
  }
  System.out.print(count);
  System.out.print(s.charAt(s.length()-1));
  }
}
