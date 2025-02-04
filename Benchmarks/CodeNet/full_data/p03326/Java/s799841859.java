
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    static int N;
    static Vec3[] vec3s;
    static long[][] memo;
    static boolean[][] memoT;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N=scanner.nextInt();
        final int M=scanner.nextInt();
        vec3s=new Vec3[N];
        for(int i=0;i<N;i++){
            vec3s[i]=new Vec3(scanner.nextLong(),scanner.nextLong(), scanner.nextLong());
        }
        long max=Long.MIN_VALUE;
        for(int i=0;i<8;i++){
            memo=new long[M+1][N+1];
            memoT=new boolean[M+1][N+1];
            long result=func(M,N,i);
            if(max<result)max=Math.abs(result);
        }
        System.out.println(max);

    }
    public static long func(int takeNum,int index,int bit){
        //System.out.println(String.format("takeNum=%d,index=%d,bit=%d",takeNum,index,bit));
        if(memoT[takeNum][index]){
            return memo[takeNum][index];
        }
        if(index==0){
            memoT[takeNum][index]=true;
            memo[takeNum][index]=0;
            return 0;

        }
        if(takeNum==0){
            long r=func(takeNum,index-1,bit);
            memoT[takeNum][index]=true;
            memo[takeNum][index]=r;
            return r;
        }
        long res=0;
        Vec3 v=vec3s[index-1];
        switch (bit){
            case 0:
                res=-v.x-v.y-v.z;
                break;
            case 1:
                res=-v.x-v.y+v.z;
                break;
            case 2:
                res=-v.x+v.y-v.z;
                break;
            case 3:
                res=-v.x+v.y+v.z;
                break;
            case 4:
                res=v.x-v.y-v.z;
                break;
            case 5:
                res=v.x-v.y+v.z;
                break;
            case 6:
                res=v.x+v.y-v.z;
                break;
            case 7:
                res=v.x+v.y+v.z;
                break;

        }
        long r=Math.max(func(takeNum-1,index-1,bit)+res,
                func(takeNum,index-1,bit));
        memoT[takeNum][index]=true;
        memo[takeNum][index]=r;
        return r;
    }
    public static class Vec3{
        long x;
        long y;
        long z;
        Vec3(long x,long y,long z){
            this.x=x;
            this.y=y;
            this.z=z;
        }
        double len(){
            return Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2));
        }
    }
}