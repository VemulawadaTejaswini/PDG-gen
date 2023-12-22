import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    Long k = sc.nextLong();
    Long count = 0l;
    for(Long i = k;i<=n+1;i++){
      Long mi = i * (i-1) / 2;
      Long ma = i * (n-i+1 + n)/2;
      count += ma - mi +1;
      //System.out.println(i +"個のとき " + (ma - mi + 1));
    }
    count = count % 1000000007;
    System.out.println(count);
  }
}
