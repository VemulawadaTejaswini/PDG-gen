import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int A = Integer.parseInt(sc.next());
    int B = Integer.parseInt(sc.next());
    int ans = 1;
    int a = A;
    for(int i = a; i < B; i++){
      a += (A-1);
      ans++;
    }
    System.out.println(ans);
  }
}