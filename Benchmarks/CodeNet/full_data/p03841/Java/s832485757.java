
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sonetsuyoshi on 2016/07/31.
 */
public class Main {

    static class Num implements Comparable<Num>{
        int num, v;
        Num(int num, int v) {
            this.num = num;
            this.v = v;
        }

        @Override
        public int compareTo(Num o) {
            return v;
        }
    }

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int N = n * n;
        Num[] arr = new Num[n + 1];
        for(int i = 1; i <= n; i++) {
            arr[i] = new Num(i, sc.nextInt());
        }

        Arrays.sort(arr);
        int m = 0;
        int l = 1;

        boolean solvable = true;
        for(int i = 1; i <= n; i++) {
            m+=l;
            l++;
            if(m > arr[i].v) solvable = false;
        }

        if(solvable) {
            int[] ans = new int[N];
            for(int i = 1; i <= n; i++) {
                if(ans[arr[i].v - 1] > 0) {
                    System.out.println("No");
                    return;
                }
                ans[arr[i].v - 1] = arr[i].num;
            }

            int cursor = 0;
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j < i; j++) {
                    while(ans[cursor] > 0) cursor++;
                    ans[cursor] = arr[i].num;
                }
            }
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n - i; j++) {
                    while(ans[cursor] > 0) cursor++;
                    ans[cursor] = arr[i].num;
                }
            }
            System.out.println(Arrays.toString(ans));
        } else {
            System.out.println("No");
        }
    }
}