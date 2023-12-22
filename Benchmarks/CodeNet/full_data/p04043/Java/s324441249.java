import java.util.*;
import javax.lang.model.util.ElementScanner6;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int[] word = new int[3];
        word[0] = sc.nextInt();
        word[1] = sc.nextInt();
        word[2] = sc.nextInt();

        // 処理
        Arrays.sort(word);
        String out;
        if (word[0] == 5 && word[1] == 5 && word[2] == 7){
            out = "YES";
        } else {
            out = "NO";
        }


        // 出力
        System.out.println(out);
    }

}