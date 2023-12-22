import java.util.*;
public class Main{   
    static int n;
    static int[][] x;
    static int[][] y;
    static int[] a;
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      x = new int[n+1][n+1];
      y = new int[n+1][n+1];
      a = new int[n+1];
      for(int i=1;i<=n;i++){
        a[i]= sc.nextInt();
        for(int j=1;j<=a[i];j++){
          x[i][j]=sc.nextInt();
          y[i][j]=sc.nextInt();
        }
      }
      boolean[] flag = new boolean[n+1];
      System.out.println(dfs(1,flag,0));
    }
    public static int dfs(int end,boolean[] arr,int ans){
      if(end==n+1)return ans;
      boolean[] arr2 = arr;
      arr2[end]=true;
      boolean g = muzyun(arr2);
      if(g)return dfs(end+1,arr,ans);
      else return Math.max(ans,Math.max(dfs(end+1,arr2,ans+1),dfs(end+1,arr,ans)));
    }
    public static boolean muzyun(boolean[] arr){
      for(int i=1;i<=n;i++){
        for(int j=1;j<=a[i];j++){
          if(y[i][j]==1&&arr[x[i][j]]==false&&arr[i]==true)return true;
          else if(y[i][j]==1&&arr[x[i][j]]==true&&arr[i]==false)return true;
          else if(y[i][j]==0&&arr[x[i][j]]==true&&arr[i]==true)return true;
          else if(y[i][j]==0&&arr[x[i][j]]==false&&arr[i]==false)return true;
        }
      }
      return false;
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