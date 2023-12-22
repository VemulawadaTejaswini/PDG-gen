import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n+1];
    for(int i=1;i<=n;i++){
      a[i]=sc.nextInt();
    }
    int ans=0;
    int[] b=new int[n+1];
    for(int i=n;i>0;i--){
      int cnt=0;
      for(int j=i+i;j<=n;j+=i){
        cnt+=b[j];
      }
      if((cnt&1)==a[i]){
        
      }else{
        b[i]=1;
        ans++;
      }
    }
//    System.err.println(Arrays.toString(a));
    System.out.println(ans);
//    System.err.println(Arrays.toString(b));
  }
}
