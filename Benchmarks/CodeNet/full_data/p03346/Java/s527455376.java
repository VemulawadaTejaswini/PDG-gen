import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {

    static class Pair {
        int a;
        int b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        //int[] array = new int[N];
        Pair[] array = new Pair[N];
        for (int i = 0; i < N; ++i) {
            array[i] = new Pair(Integer.parseInt(scanner.nextLine()), i);
        }
        Arrays.sort(array, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.a - o1.a;
            }
        });

        int max = 0;
        int value = 0;
        int prep = 0;
        for (int i = 0; i < N; ++i) {
            if (array[i].b < prep) {
                ++value;
            } else {
                if (max < value) {
                    max = value;
                }
                value = 1;
            }
            prep = array[i].b;
        }
        System.out.println(N - max);
    }
}