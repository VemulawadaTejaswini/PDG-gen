import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] a = new long[n];
    long[] s = new long[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextLong();
    }
    s[0]=a[0];
    for(int i=1;i<n;i++)s[i]=s[i-1]+a[i];
    long cnt1 = 0;
    long cnt2 = 0;
    long[] t = new long[n];
    for(int i=0;i<n;i++)t[i]=s[i];
    for(int i=0;i<n;i++){
      if(i%2==0){
        if(s[i]<=0){
          cnt1+=1-s[i];
          for(int j=i+1;j<n;j++)s[j]+=1-s[i];
          s[i]=1;
        }
      }else{
        if(s[i]>=0){
          cnt1+=1+s[i];
          for(int j=i+1;j<n;j++)s[j]-=1+s[i];
          s[i]=-1;
        }
      }
    }
    for(int i=0;i<n;i++){
      if(i%2==1){
        if(t[i]<=0){
          cnt2+=1-t[i];
          for(int j=i+1;j<n;j++)t[j]+=1-t[i];
          t[i]=1;
        }
      }else{
        if(t[i]>=0){
          cnt2+=1+t[i];
          for(int j=i+1;j<n;j++)t[j]-=1+t[i];
          t[i]=-1;
        }
      }
    }
    System.out.println(Math.min(cnt1,cnt2));
  }
}