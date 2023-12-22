import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    for (int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
    for (int i=0;i<n;i++){
      b[i] = sc.nextInt();
    }
    sc.close();
    long p = 0;
    long m = 0;
    int pc = 0;
    int ans = 0;
    int d = 0;
    List<Integer> plist = new ArrayList<>();
    for (int i=0;i<n;i++){
      d = a[i] - b[i];
      if (d > 0){
        p += d;
        pc++;
        plist.add(d);
      }else if (d < 0){
        m += d;
        ans++;
      }
    }
    if (p<-m){
      System.out.println(-1);
    }else{
      Collections.sort(plist, Collections.reverseOrder());
      for (int i:plist){
        if (m>0) break;
        m += i;
        ans++;
      }
      System.out.println(ans);
    }
  }
}