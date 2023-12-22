import java.util.*;
public class Main{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int n = Integer.parseInt(sc.next());
  int a = Integer.parseInt(sc.next());
  int ans = n%500;
  if (ans <= a){
    System.out.println("YES");
  }
  else {
    System.out.println("NO");
  }
  }
}
