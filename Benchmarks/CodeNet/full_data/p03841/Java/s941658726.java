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
            StringBuilder sb = new StringBuilder();
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= i; j++) {
                    sb.append(arr[i].num + " ");
                }
            }
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n - i; j++) {
                    sb.append(arr[i].num + " ");
                }
            }
            System.out.println(sb.toString());
        } else {
            System.out.println("No");
        }
    }
}