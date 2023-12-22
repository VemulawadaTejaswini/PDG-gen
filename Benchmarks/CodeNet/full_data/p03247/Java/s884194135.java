import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Santa.
 */
public class Main {

    static int N;
    static int K;
    static int Q;
    static int A;
    static long B;
    static long C;
    //    static int[][] map;
    static int min = 9999999;
    static long ans = 0;

    static class pair {
            public int a;
            public int b;

            pair(){
                this.a = 0;
                this.b = 0;
            }

            pair(int a, int b){
                this.a = a;
                this.b = b;
            }

            public void set(int a, int b) {
                this.a = a;
                this.b = b;
            }
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        pair[] map = new pair[N];

        int man = 0;
        int onazi = 0;
        int old = 987;
        int max = 2;
        int flag = 0;
        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            map[i] = new pair(a, b);
            man = Math.abs(a) + Math.abs(b);
            if(man > 22)flag = 1;
            if(old == man % 2) onazi++;
            max = Math.max(man, max);
            old = man % 2;
        }

        if(flag == 1)return;
//        System.out.println(onazi);

        if(onazi == N - 1) {

            System.out.println(max);
            System.out.print(1);
            for (int i = 1; i < max; i++) {
                System.out.print(" " + 1);
            }
            System.out.println();

            for (int i = 0; i < N; i++) {
                int nokori = max;
                int a = map[i].a;
                int b = map[i].b;

                if (a < 0) {
                    for (int j = 0; j < -a; j++) {
                        System.out.print("L");
                    }
                    nokori += a;
                } else {
                    for (int j = 0; j < a; j++) {
                        System.out.print("R");
                    }
                    nokori -= a;
                }

                if (b < 0) {
                    for (int j = 0; j < -b; j++) {
                        System.out.print("D");
                    }
                    nokori += b;
                } else {
                    for (int j = 0; j < b; j++) {
                        System.out.print("U");
                    }
                    nokori -= b;
                }

                for (int j = 0; j < nokori / 2; j++) {
                    System.out.print("LR");
                }
                System.out.println();

            }
        }else{
            System.out.println("-1");
        }






    }
}

