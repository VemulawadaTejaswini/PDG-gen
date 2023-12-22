import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int M=sc.nextInt();
        int[] a=new int[A];
        int[] b=new int[B];
        
        int amin=1000000007;
        int bmin=1000000007;
        for(int i=0;i<A;i++){
            a[i]=sc.nextInt();
            if(a[i]<amin) amin=a[i];
        }
        
        for(int i=0;i<B;i++){
            b[i]=sc.nextInt();
            if(b[i]<bmin) bmin=b[i];
        }
        
        int ans=amin+bmin;
        
        for(int i=0;i<M;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int s=a[x-1]+b[y-1]-z;
            if(s<ans){
                ans=s;
            }
        }
        
        System.out.println(ans);
    }
}
