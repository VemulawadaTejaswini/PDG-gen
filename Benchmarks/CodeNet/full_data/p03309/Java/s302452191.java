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
      int p[]=d;
      int b=d[n/2];
      for(int i=0;i<n;i++){
            d[i]=d[i]-b;
        }
      int ans=0;
      for(int i=0;i<n;i++){
            ans+=Math.max(d[i],-d[i]);
        }
        
    b=p[n/2-1];
      for(int i=0;i<n;i++){
            p[i]=p[i]-b;
        }
      int ans2=0;
      for(int i=0;i<n;i++){
            ans2+=Math.max(p[i],-p[i]);
        }
        
        
        
        
        
        
      System.out.println(Math.min(ans,ans2));
    }
}