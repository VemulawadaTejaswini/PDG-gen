import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(Integer.parseInt(sc.next()));
        }

        // 主処理
        int result = 0;
        int[] target = a.stream().mapToInt(t -> t).filter(t -> t % 2 == 0).toArray();
        for (int i = 0; i < target.length; i++) {
            while (target[i] % 2 == 0) {
                target[i] /= 2;
                result++;
            }
        }

        // 出力
        System.out.println(result);
        sc.close();
    }
}