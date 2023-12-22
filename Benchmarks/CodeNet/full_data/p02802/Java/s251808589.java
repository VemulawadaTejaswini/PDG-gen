import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m = sc.nextInt();
      int[] p = new int[m];
      String[] s = new String[m];
      int[] ac = new int[n+1];
      int[] pena = new int[n+1];
      for(int i=0;i<m;i++){
        p[i]=sc.nextInt();
        s[i]=sc.next();
        if(s[i].equals("WA")&&ac[p[i]]==0)pena[p[i]]++;
        else if(s[i].equals("AC")&&ac[p[i]]==0){
          pena[p[i]]=0;
          ac[p[i]]++;
        }
      }
      int sum1 = 0;
      int sum2 = 0;
      for(int i=1;i<=n;i++){
        sum1+=pena[i];
        if(ac[i]>0)sum2++;
      }
      System.out.println(sum1+" "+sum2);
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