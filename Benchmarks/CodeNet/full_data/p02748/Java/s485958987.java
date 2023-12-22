import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 22
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = sc.nextInt();
        int[] a = new int[A];
        int[] b = new int[B];
        for(int i = 0; i < A; i++)
            a[i] = sc.nextInt();
        for(int i = 0; i < B; i++)
            b[i] = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < M; i++) {
            int ai = sc.nextInt();
            int bi = sc.nextInt();
            list.add(a[ai] + b[bi] - sc.nextInt());
        }
        Arrays.sort(a);
        Arrays.sort(b);
        Collections.sort(list);

        System.out.println(Math.min(a[0] + b[0], list.get(0)));
    }

}
