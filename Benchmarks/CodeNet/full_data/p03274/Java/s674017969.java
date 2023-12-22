import java.util.*;

class Main{
    public static int abs(int a){
        return (a>0)?a:(-a);
    }
    
    public static int min(int a,int b){
        return (a<b)?a:b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int[] x=new int[N];
        
        for(int i=0;i<N;i++){
            x[i]=sc.nextInt();
        }
        
        int ans=1000000000;
        
        for(int i=0;i<N-K+1;i++){
            int tmp=abs(x[i]-x[i+N-K])+min(abs(x[i]),abs(x[i+N-K]));
            if(ans>tmp){
                ans=tmp;
            }
        }
        
        System.out.println(ans);
    }
}