import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
    int x = sc.nextInt(); 
    int y = sc.nextInt(); 
     if(x<0||y<0||(y+x)%3!=0) System.out.println(0);
else if(x>=y){
 int k = x - y;
  int t = (y - k)/3;
    
  System.out.println(nCk(2*t+3*k, t+k,1000000007));
}
   else{
 int k = y - x;
  int t = (x - k)/3;
    
  System.out.println(nCk(2*t+3*k, t+k,1000000007));

}

 }
    public static int nCk(int n,int k,int M) {
        long ret = 1;
        int min = Math.min(k, n-k);
        for(int i=1;i<=min;i++) {
            ret = (ret * pow(i,M-2,M)) % M;
        }
        for(int i=n-min+1;i<=n;i++) {
            ret = (ret * i) % M;
        }
        return (int)ret;
    }

    public static long pow(long a,long b,int M) {
        long ret = 1;
        long tmp = a;
        while(b>0) {
            if((b&1)==1) ret = (ret * tmp) % M;
            tmp = (tmp * tmp) % M;
            b = b>>1;
        }
        return ret;
    }
}