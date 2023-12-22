import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // 入力文字を読み込む
        Scanner sc = new Scanner(System.in);
        // 入力文字を分解する
        int number = Integer.parseInt(sc.next());

        ArrayList<Integer> arrayList = new ArrayList<>();
        // 配列の1個目～number個目までにSを入れる
        for (int i = 0; i < number; i++) {
            arrayList.add(Integer.parseInt(sc.next()));
        }

        // 割った回数をカウントする変数を用意する
        int count = 0;

         // arrayListの変数を2で割った余りを求める
        if(arrayList.stream().allMatch(e -> e % 2 != 0)) {
            arrayList.stream().map(e -> e / 2);
            count++;
        }

        System.out.println(count);
    }
}
