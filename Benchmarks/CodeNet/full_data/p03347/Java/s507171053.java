
import java.util.*;



public class Main {
    public static int[] ints;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        final int N=scanner.nextInt();
        ints=new int[N];
        for(int i=0;i<N;i++){
            ints[i]=scanner.nextInt();
        }
        if(ints[0]!=0){
            System.out.println(-1);
            return;
        }
        for(int i=0;i<N-1;i++){
            if(ints[i+1]-ints[i]>=2){
                System.out.println(-1);
                return;
            }
        }
        System.out.println(func(N-1,0));
    }
    public static long func(int endIndex,long val){
        if(endIndex==0){
            return val;
        }else{
            if(ints[endIndex]==0) return func(endIndex-1,val);
            int endVal=ints[endIndex];
            val+=endVal;
            while(ints[endIndex]==endVal){
                endIndex--;
                endVal--;
                if(endIndex==0) break;
            }
            return func(endIndex,val);
        }
    }

}