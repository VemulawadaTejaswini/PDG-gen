import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        long M = scan.nextLong();
        long[] Array = new long[N];
        for(int i = 0; i < N; i++){
            Array[i] = scan.nextLong();
        }
        long count = 0;
        for(int i = 0; i < N; i++){
            long sum = 0;
            for(int k = i; k < N; k++){
                sum += Array[k];
                sum %= M;
                if(sum == 0)count++;
            }
        }
        System.out.println(count);
    }
}
