import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = 1;
    for(int i=1;(a+(a-1)*i)<=b;i++){
      ans++;
    }
    System.out.println(ans);
  }
}