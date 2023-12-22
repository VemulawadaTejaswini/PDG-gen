import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    Set a = new HashSet();
    for (int i = 0;i<n;i++){
      a.add(sc.nextInt());
    }
    System.out.println(Math.max(0,a.size()-k));
  }
}