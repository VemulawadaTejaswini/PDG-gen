import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] d = new int[n];
    for(int i = 0;i < n;i++)d[i]=sc.nextInt();
    int m = sc.nextInt();
    int[] t = new int[m];
    for(int i = 0;i < m;i++)t[i]=sc.nextInt();
    Arrays.sort(d);
    Arrays.sort(t);
    int cnt = 0;
    int i = 0;
    int j = 0;
    int c = 0;
    while(d[i+1]<=t[j])i++;
    while(i < n&&cnt<m){
      if(d[i]==t[j]){
        i++;
        cnt++;
      }
      j++;
      if(j==m){
        i++;
        j=cnt;
      }
    }
    System.out.println((cnt==m)?"YES":"NO");
  }
}