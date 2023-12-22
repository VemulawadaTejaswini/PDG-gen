import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        ArrayList<int []> list = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            int [] tmp = new int[2];
            tmp[0] = i;
            tmp[1] = 1; // フラグ
            list.add(tmp);
            result.add(0);
        }

        for (int i = 0; i < N - 1; i++) {
            int worker = scan.nextInt();
            for (int j = worker; j < N; j++) {
                if (list.get(j)[1] == 1) {
                    result.set(worker - 1, result.get(worker - 1) + 1);
                    list.get(j)[1] = 0;
                    break;
                }

            }
        }

        for (Integer r : result) {
            System.out.println(r);
        }

    }
}
