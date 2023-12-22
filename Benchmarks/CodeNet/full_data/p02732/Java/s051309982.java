import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int ac[] = new int[n];
    for(int i = 0;i<n;i++){
      a[i] = sc.nextInt();
      ac[i] = a[i];
    }
    int ans = 0;
    int count = 0;
    for(int k = 0;k<n;k++){
      ac[k] = -1;
      ans = 0;
      for(int i = 0;i<n;i++){
        if(ac[i] == -1){
          continue;
        }
        count = 1;
        for(int ii = 0;ii<n;ii++){
          if(ii != i && ac[ii] == ac[i]){
            ac[ii] = -1;
            count++;
          }
        }
        ans += count * (count - 1) / 2;
      }
      System.out.println(ans);
      for(int j = 0;j<n;j++){
        ac[j] = a[j];
      }
    }
  }
}
