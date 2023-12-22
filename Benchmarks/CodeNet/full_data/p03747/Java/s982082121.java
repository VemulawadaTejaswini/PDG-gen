/**
 * Created by kame on 2017/04/15.
 */
/**
 * Created by kame on 2017/04/15.
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        long L=sc.nextInt();
        long T=sc.nextInt();
        long[] X=new long[N];
        int[] W=new int[N];
        int down=0;
        int up=0;
        for(int i=0;i<N;i++){
            X[i]=sc.nextInt();
            W[i]=sc.nextInt();
            if(W[i]==1){
                down++;
            }else{
                up++;
            }
        }
        if(down==0){
            for(int i=0;i<N;i++){
                System.out.println((X[i]-(long)T)%(long)L);
            }
            return;
        }
        if(up==0){
            for(int i=0;i<N;i++){
                System.out.println((X[i]+(long)T)%(long)L);
            }
            return;
        }
        int mUp=0;
        int mDown=0;
        long[] Xup=new long[up];
        long[] Xdown=new long[down];
        for(int i=0;i<N;i++){
            if(W[i]==1){
                if(W[0]==1) {
                    Xdown[(down-mDown)%down] = X[i];
                }else{
                    Xdown[down-1-mDown] = X[i];
                }
                mDown++;
            }else{
                Xup[mUp]=X[i];
                mUp++;
            }
        }
        //二分探索
        long maxPos=1000000000;
        long minPos=0;
        long pos=500000000;
        while(true){
            long dis1=0;
            long dis2=0;
                dis1 += (pos / (long) down+1) * (L) - Xdown[(int) pos % down];
                dis1 += (pos / (long) up) * (L) + Xup[(int) pos % up];
                dis2 += ((pos+1) / (long) down+1) * (L) - Xdown[(int) (pos+1) % down];
                dis2 += ((pos+1) / (long) up) * (L) + Xup[(int) (pos+1) % up];
            if(dis1<=2*T&&2*T<dis2){
                break;
            }
            if(dis1>2*T){
                maxPos=pos;
                pos=(maxPos+minPos)/2;
                continue;
            }
            if(dis2<=2*T){
                minPos=pos;
                pos=(maxPos+minPos)/2;
                continue;
            }
            if(pos==0){
                pos=-1;
                break;
            }
        }
        pos++;
        int x0pos=0;
        boolean downfrag=true;
        if(pos==0){
            x0pos=(int)(X[0]+T*(2*W[0]-3));
        }else{

        if(W[0]==1){
            if((pos / (long) down+1) * (L) - Xdown[(int) pos % down]
                    +((pos-1) / (long) up) * (L) + Xup[(int) (pos-1) % up]<2*T){
                x0pos=(int)((Xdown[(int)(pos%down)]+T)%L);
                //下り便にいる
            }else{
                x0pos=(int)((Xup[(int)((pos-1)%up)]-T)%L);
                downfrag=false;
                //上り便にいる
            }
        }else{
            if(((pos-1) / (long) down+1) * (L) - Xdown[(int) (pos-1) % down]
                    +((pos) / (long) up) * (L) + Xup[(int) (pos) % up]<=2*T){
                x0pos=(int)((Xup[(int)((pos)%up)]-T)%L);
                downfrag=false;
                //上り便にいる
            }else{
                x0pos=(int)((Xdown[(int)((pos-1)%down)]+T)%L);
                //下り便にいる

            }

        }}
        for(int i=0;i<N;i++){
            if(W[i]==1){
                X[i]=(X[i]+(long)T-x0pos)%(long)L;
            }else{
                X[i]=(X[i]-(long)T-x0pos)%(long)L;
            }
            if(X[i]<0){
                X[i]+=L;
            }
        }
        Arrays.sort(X);
        if(X[1]==0&&downfrag){
                for(int i=1;i<N;i++){
                    System.out.println((X[i]+x0pos)%L);
                }
            System.out.println((X[0]+x0pos)%L);
                

        }else{
            for(int i=0;i<N;i++){
                System.out.println((X[i]+x0pos)%L);
            }
        }
    }

}