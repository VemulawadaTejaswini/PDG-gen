import java.util.*;
 
 
public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
 
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String line = sc.nextLine();
        String s[]=line.split(" ",0);
        int d[]=new int[n];
        for(int i=0;i<n;i++){
            d[i]=Integer.parseInt(s[i])-(i+1);
        }
      Arrays.sort(d);
      int b=0;
      if(n%2==0){
        b=(d[n/2]+d[n/2-1])/2;
      }
      else
      b=d[n/2];
      for(int i=0;i<n;i++){
            d[i]=d[i]-b;
        }
      int ans=0;
      for(int i=0;i<n;i++){
            ans+=Math.max(d[i],-d[i]);
        }
      System.out.println(ans);
    }
}