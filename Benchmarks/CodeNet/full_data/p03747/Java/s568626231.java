import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int TIME = sc.nextInt();
        double[] xs = new double[N];
        int[] ds = new int[N];
        int[] ns = new int[N];

        for (int i = 0; i < N; i++) {
            xs[i] = sc.nextInt();
            ds[i] = sc.nextInt();
            ns[i] = i;
        }

        for (int i = 0; i < TIME * 2; i++) {
            for (int j = 0; j < N; j++) {
                if (ds[j] == 1) {
                    xs[j] = (xs[j] + 0.5) % L;
                } else {
                    double tmp = xs[j] - 0.5;
                    if (tmp >= 0) {
                        xs[j] = tmp;
                    } else {
                        xs[j] = tmp + L;
                    }
                }
            }

//            System.out.println("i: " + i + " " + Arrays.toString(xs));
//
//            System.out.println("b: "+ Arrays.toString(ns));
            for (int j = 0; j < N; j++) {
                for (int k = j + 1; k < N; k++) {
                    if (xs[j] == xs[k]) {
                        int tmp = ns[j];
                        ns[j] = ns[k];
                        ns[k] = tmp;
                    }
                }
            }
//            System.out.println("a: "+ Arrays.toString(ns));
        }

        int i = 0;
        int j = 0;
        while(i < N) {
            if (ns[j] == i) {
                System.out.println((int) xs[j]);
                i++;
                j = 0;
            } else {
                j++;
            }

            if (j >= N) {
                throw new RuntimeException("OVER");
            }
        }
//        for (int i = 0; i < N; i++) {
//            if (ns[i] == i) {
//                System.out.println(xs[ns[i]]);
//                break;
//            }
//        }
    }
}
