import java.util.*;
public class Main{   
    static int[] ans;
    static ArrayList<Pair>[] list;
    static int n;
    static int max;
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      list = new ArrayList[n];
      ans = new int[n-1];
      for(int i=0;i<n;i++)list[i]=new ArrayList<>();
      for(int i=0;i<n-1;i++){
        int a = sc.nextInt()-1;
        int b = sc.nextInt()-1;
        list[a].add(new Pair(b,i));
        list[b].add(new Pair(a,i));
      }
      dfs(-1,-1,0);
      System.out.println(max);
      for(int i=0;i<n-1;i++)System.out.println(ans[i]);
    }
    static void dfs(int front,int q,int now){
      int cnt = 1;
      for(Pair p:list[now]){
        if(p.a==front)continue;
        if(cnt==q)cnt++;
        max = Math.max(max,cnt);
        ans[p.b]=cnt;
        dfs(now,cnt++,p.a);
      }
    }
    public static int lcm(int x, int y){
      return x*y/gcd(x,y);
    }
    public static int gcd(int x, int y){
      if(x < y)return gcd(y,x);
      if(y==0)return x;
      return gcd(y,x%y);
    }
}
class Pair{
    int a,b;

    Pair(int a, int b){
      this.a = a;
      this.b = b;
    }
}