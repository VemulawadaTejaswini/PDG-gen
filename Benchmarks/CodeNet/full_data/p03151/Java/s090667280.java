import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */
import java.util.*;
import java.io.*;

public class Main {
    public static long sum(long[] array){
        long ans = 0;
        for(long e:array) ans+=e;
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        long[] B = new long[N];
        for(int n=0;n<N;n++) A[n]=sc.nextLong();
        for(int n=0;n<N;n++) B[n]=sc.nextLong();

        if(sum(A)<sum(B)){
            System.out.println("-1");
            return;
        }
        int notEnoughStudy = 0;
        long extraStudy = 0;
        PriorityQueue<Long> margin = new PriorityQueue<>(Comparator.reverseOrder());
        for(int n=0; n<N; n++){
            if(A[n]<B[n]){
                notEnoughStudy++;
                extraStudy += (B[n]-A[n]);
            }else{
                margin.add(A[n]-B[n]);
            }
        }
        int decrease = 0;
        while(extraStudy>0){
            extraStudy -= margin.poll();
            decrease++;
        }
        System.out.println(notEnoughStudy+decrease);


    }
}
