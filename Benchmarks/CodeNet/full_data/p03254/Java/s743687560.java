import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++) a[i] = sc.nextInt();
    Arrays.sort(a);
    int cnt=0;
    for(int i=0;i<n;i++){
      if(x-a[i]>=0){
        x-=a[i];
        cnt++;
      }
    }
    if(x>0&&cnt>0) cnt--;
    System.out.println(cnt);
  }
}