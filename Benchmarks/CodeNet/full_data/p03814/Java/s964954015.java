import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        // 主処理
        int indexA = s.indexOf("A");
        int indexZ = s.lastIndexOf("Z");
        int result = indexZ - indexA + 1;

        // 出力
        System.out.println(result);
    }
}
