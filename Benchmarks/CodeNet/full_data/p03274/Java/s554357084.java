import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 

        int N = sc.nextInt();
        int K = sc.nextInt();
        long[] x = new long[N];
        for(int i = 0; i < N; i++){
            x[i] = sc.nextLong();
        }
        sc.close();

        int left = left_num(x);
        int right;
        long xl = 0;
        long xr = 0;
        long min = 2*(x[N-1] - x[0]);
            right = N - left;
            //i:左側の個数
            for(int i = 0; i <= Math.min(left, K); i++){
                int j = K-i; //右側に行く個数
                if(right < j)
                    continue;
                else{
                    if(i == 0){
                        min = Math.min(min, Math.abs(x[left+K-1]));
                    }
                    if(j == 0)
                        if(!(exist_0(x)))
                            min = Math.min(min, Math.abs(x[left-K]));
                        else
                            min = Math.min(min, Math.abs(x[left-K+1]));
                    if(i > 0 && j > 0){
                        xl = x[left-i];
                        xr = x[left+j-1];
                        long dis = Math.min((Math.abs(xl) + Math.abs(xl-xr)),
                                             (Math.abs(xr) + Math.abs(xl-xr)));
                        min = Math.min(min, dis);
                    }
                }
            }
        System.out.println(min);

    }
    static boolean exist_0(long[] a){
        for(int i = 0; i < a.length; i++){
            if(a[i] == 0)
                return true;
        }
        return false;
    }
    static int left_num(long[] a){
        int index = 0;
        while(a[index] < 0){
            index++;
        }
        return index;
    }
}