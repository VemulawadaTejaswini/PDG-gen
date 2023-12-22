import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long[] city = new long[6],
               capacity = new long[5];
        for(int i = 0; i < 5; i++){
            capacity[i] = sc.nextLong();
        }
        sc.close();
        city[0] = N;
        long time;
        int minIdx = minIdx(capacity);
        time = 5 + (N-1)/capacity[minIdx];       
        System.out.println(time);
    }
    public static int minIdx(long[] capa){
        int idx = 0;
        long min = capa[0];
        for(int i = 1; i < 5; i++){
            if(capa[i] < min){
                min = capa[i];
                idx = i;
            }
        }
        return idx;
    }
}