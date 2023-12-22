import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int r = sc.nextInt();
    long ans = 2020;

    r = Math.min(r, l+2019*2);

    for(long i=l; i<=r; ++i) {
      for(long j=i+1; j<=r; ++j) {
        ans = Math.min(ans, i*j%2019);
      }
    }
    System.out.println(ans);
  }
}