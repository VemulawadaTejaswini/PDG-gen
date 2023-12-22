import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    double ans=0;
    for(int i = 1;i<=n;i++){
      int pt = i;
      for(int j = 0;;j++){
        if(pt>=k){
          ans += Math.pow(0.5,j);
          break;
        }else{
          pt = pt*2;
        }
        
      }
    }
    ans = ans/n;
    System.out.println(String.format("%.10f", ans));
  }
}