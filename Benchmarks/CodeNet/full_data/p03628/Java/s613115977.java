import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long cnt = 1;
    long mod = 1000000007;
    char[] c1 = sc.next().toCharArray();
    char[] c2 = sc.next().toCharArray();
    int i = 0;
    if(c1[0]==c2[0])cnt=3;
    if(c1[0]!=c2[0]){
      cnt=3;
      i++;
    }
    while(i < n-1){
      if(c1[i]!=c2[i]&&c1[i+1]!=c2[i+1]&&c1[i]!=c1[i+1])cnt=(cnt*3)%mod;
      else if(c1[i]!=c2[i]&&c1[i+1]==c2[i+1])cnt=cnt%mod;
      else if(c1[i]==c2[i]&&c1[i+1]!=c2[i+1])cnt=(cnt*2)%mod;
      else if(c1[i]==c2[i]&&c1[i+1]==c2[i+1])cnt=(cnt*2)%mod;
      i++;
    }
    System.out.println(cnt);
  }
}