import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int ans = 0;
    for(int i = 1;i<=k;i++){
      for(int ii = 1;ii<=k;ii++){
        for(int iii = 1;iii<=k;iii++){
          int a[] = new int[3];
          a[0] = i;
          a[1] = ii;
          a[2] = iii;
          Arrays.sort(a);
          int b = gcd(a[2],a[1]);
          int c = Math.max(b,a[0]);
          int d = Math.min(b,a[0]);
          ans += gcd(c,d);
        }
      }
    }
    System.out.println(ans);
  }
  public static int gcd(int a,int b){
    int temp = -1;
    while((temp = a%b)!=0){
      a = b;
      b = temp;
    }
    return b;
  }
}
