import java.util.*;

public class Main {
    public static int abs(int a){
        return (a>0)?a:(-a);
    }
    public static int gcd(int a,int b){
        if(a<0) return gcd(-a,b);
        if(b<0) return gcd(a,-b);
        if(a<b) return gcd(b,a);
        if(a%b==0) return b;
        return gcd(b,a%b);
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int X=sc.nextInt();
        int[] x=new int[N];
        
        if(N==1){
            x[0]=sc.nextInt();
            System.out.println(abs(x[0]-X));
            return ;
        }
        
        for(int i=0;i<N;i++){
            x[i]=sc.nextInt()-X;
        }
        
        int gcd=gcd(x[0],x[1]);
        
        for(int i=2;i<N;i++){
            gcd=gcd(gcd,x[i]);
        }
        
        System.out.println(gcd);
    }
}
