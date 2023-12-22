import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Y = sc.nextInt();

        int[] list = new int[N+1];

        for (int i=0; i<N+1; i++) {
            list[i] = Y - 1000 * i;
        }
        Arrays.sort(list);

        for (int i=0; i<N+1; i++) {
            for (int j=0; i<N+1; i++) {
                if (10000*i + 5000*j + 1000*(N - i - j) == Y) {
                    System.out.println(i + " " + j + " " + (N - i - j));
                    return;
                }

                /*
                int index = Arrays.binarySearch(list, 10000 * i + 5000 * j);
                if (index < 0) {
                    continue;
                }
                if (index == (N - i - j)) {
                if ((Y - list[index + 1]) == (1000 * (N - i - j))) {
                }
                */
            }
        }
        System.out.println("-1 -1 -1");
    }
}

