import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] A = new long[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextLong();
        }
        long[] skip = new long[N];
        for(int i = 0; i < N; i++) {
            if(i != 0 && skip[i - 1] != 0) {
                skip[i] = skip[i - 1] - 1;
            }else if(A[i] == 0) {
                int cou = 0;
                for(int j = i; j < N; j++) {
                    if(A[j] == 0) cou++;
                    else break;
                }
                skip[i] = cou;
            }
        }
        long count = 0;
        for(int i = 0; i < N; i++) {
            long xor = 0L;
            long add = 0L;
            for(int j = 0; ; j++) {
                int id = i + j;
                if(id >= N) break;
                if(skip[id] > 0) {
                    j += skip[id]-1;
                    count += skip[id];
                    continue;
                }
                add += A[id];
                xor ^= A[id];

                if(add == xor) count++;
                if(xor < add) break;
            }
        }
        System.out.println(count);





    }
}