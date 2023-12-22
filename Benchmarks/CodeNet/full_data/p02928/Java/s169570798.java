import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = sc.nextInt();
        long K = sc.nextLong();

        long[] arr = new long[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextLong();
        }

        long inversions = 0;


        long first = 0;
        for(int i = 0; i < N; i++) {
            long curr = arr[i];

            for(int j = i; j < N; j++) {
                if(curr > arr[j]) {
                    first++;
                }
            }
        }

        inversions = first * K;

        Arrays.sort(arr);

        long prev = arr[0];
        long countPrev = 0;

        for(int i = 1; i < N; i++) {
            long curr = arr[i];
            long tempCount = 0;
            if(prev == curr) {
                tempCount = countPrev;

            } else {
                prev = arr[i];
                tempCount = i * (K);
                countPrev = tempCount;
            }
            //System.out.println(tempCount);
            inversions += tempCount;

        }
        System.out.println(inversions % (long)(Math.pow(10,9) + 7));

    }
}
