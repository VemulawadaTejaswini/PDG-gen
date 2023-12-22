import java.util.*;
import java.util.Arrays;
import java.util.Set;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[]a=new int[M];
        int[]b=new int[M];
        int k=0;
        for(int i=0;i<M;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int[]c=new int[M];
        for(int i=0;i<M;i++){
            c[i]=0;
        }
        for(int i=0;i<M;i++){
            if(a[i]==1){
                c[i]++;
            }
        }
        int[]d=new int[M];
        for(int i=0;i<M;i++){
            d[i]=0;
        }
        boolean tansaku=false;
        int kazu=0;
        for(int i=0;i<M;i++){
        if(c[i]>0){
            kazu++;

        }}
        int[]ll=new int[kazu];
        int tt=0;
        for(int i=0;i<M;i++){
            if(c[i]>0){
                ll[tt]=b[i];
                tt++;
            }
        }
        int yy=0;
        for(int i=0;i<M;i++){
            if(ll[yy]==a[i]){
                if(b[i]==N){
                    tansaku=true;
                }
            }
        }
        if(tansaku){
            System.out.println("POSSIBLE");
        }else{
            System.out.println("IMPOSSIBLE");
        }



        }
        
        
    }
