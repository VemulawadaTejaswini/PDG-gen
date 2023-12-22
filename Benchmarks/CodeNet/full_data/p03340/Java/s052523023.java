import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        int count = 0;
        for(int i = 0; i < N; i++) {
            int xor = 0;
            int add = 0;
            for(int j = 0; j < 30; j++) {
                int id = i + j;
                if(id >= N) break;
                add += A[id];
                xor ^= A[id];

                if(add == xor) count++;
            }
        }
        System.out.println(count);





    }
}