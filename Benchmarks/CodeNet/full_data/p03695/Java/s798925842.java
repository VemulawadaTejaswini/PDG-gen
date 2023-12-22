import java.util.*;
public class Main{   
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i = 0;i < n;i++)a[i]=sc.nextInt();
      int[] cnt = new int[9];
      for(int i = 0;i < n;i++){
      	if(a[i]<400)cnt[0]++;
        else if(a[i]<800)cnt[1]++;
        else if(a[i]<1200)cnt[2]++;
        else if(a[i]<1600)cnt[3]++;
        else if(a[i]<2000)cnt[4]++;
        else if(a[i]<2400)cnt[5]++;
        else if(a[i]<2800)cnt[6]++;
        else if(a[i]<3200)cnt[7]++;
        else cnt[8]++;
      }
      int sum = 0;
      for(int i = 0;i < 8;i++)if(cnt[i]>0)sum++;
      if(sum==0)System.out.println(1+" "+(sum+cnt[8]));
      else{
      	System.out.println(sum+" "+(sum+cnt[8]));
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
