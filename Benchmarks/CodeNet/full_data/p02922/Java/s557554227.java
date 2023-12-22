import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int ans=0;
    int cnt=1;
    while(cnt<B) {
      cnt--;
      cnt+=A;
      ans++;
    }
    System.out.println(ans);
  }
}