import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String[] a = new String[N];
    int ans = 0;
    int aa = 0;
    int bb = 0;
    
    for(int i=0;i<N;i++){
      a[i] = sc.next();
      if(a[i].matches(".*AB.*")){
        ans++;
      }
      if(a[i].startsWith("B")){
        bb++;
      }
      if(a[i].endsWith("A")){
        aa++;
      }
    }
    if(aa - bb >= 0){
      ans += bb;
    }else{
      ans += aa;
    }
    
    System.out.println(ans);
  }
}
