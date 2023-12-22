import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 数列A
        int[] arrayA = new int[n];
        List<Integer> arrayB = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrayA[i] = sc.nextInt();

            // 数列の i 番目の要素 ai を b の末尾に追加する。
            arrayB.add(arrayB.size(), arrayA[i]);

            // b を逆向きに並び替える。
            Collections.reverse(arrayB);
        }

        System.out.println(arrayB.stream().map(i -> i.toString()).collect(Collectors.joining(" ")));
    }

}