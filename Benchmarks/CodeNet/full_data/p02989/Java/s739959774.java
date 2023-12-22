import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    public void run() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] d = new int[N];

        for (int i = 0; i < N; i++) {
            d[i] = sc.nextInt();
        }
        Arrays.sort(d);


        int pivot = (d.length-1)/2;
        System.out.println(d[pivot + 1] - d[pivot]);

        return;
    }

}