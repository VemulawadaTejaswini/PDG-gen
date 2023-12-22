import java.util.*;
public class Main{
  public static void main(String[] args){
    int i,tmp;
    int ans=0;
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int[] b=new int[n];
    for(i=0;i<n;i++){
      a[i]=sc.nextInt();
      b[i]=sc.nextInt();
    }
    for(i=n-1;i>=0;i--){
      tmp=(a[i]+ans)%b[i];
      if(tmp!=0)ans+=n-tmp;
    }
    System.out.println(ans);
  }
}
