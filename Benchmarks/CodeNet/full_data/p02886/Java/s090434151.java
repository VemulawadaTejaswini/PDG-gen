import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] numList = new int[N];
        for (int i = 0; i < N; i++) {
            numList[i] = Integer.parseInt(sc.next());
        }

        int r = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                r += numList[i] * numList[j];
            }
        }
        System.out.println(r);
    }
}