import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Set;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]t=new int[N+1];
        int[]x=new int[N+1];
        int[]y=new int[N+1];
        boolean kuku=true;
        t[0]=0;
        x[0]=0;
        y[0]=0;
        for(int i=1;i<N+1;i++){
            t[i]=sc.nextInt();
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            if((i%2==0)&&((x[i]+y[i])%2==1)){
                kuku=false;
            }
            if((i%2==1)&&((x[i]+y[i])%2==0)){
                kuku=false;
            }

        }
        boolean saishuu=true;
        if(kuku){
            for(int i=0;i<N;i++){
                int l=t[i+1]-t[i];
                int xx=x[i+1]-x[i];
                int yy=y[i+1]-y[i];
                int ll=Math.abs(xx)+Math.abs(yy);
                if(ll>l){saishuu=false;
                }
            }
            if(saishuu){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }else{
            System.out.println("No");
        }


        
}
        
        
    }
