import java.util.*;

public class Main {

    public static void main(String args[]) {

        // 入力
        Scanner sc = new Scanner(System.in);
        Integer[] c1 = new Integer[3];
        Integer[] c2 = new Integer[3];
        Integer[] c3 = new Integer[3];
        Arrays.setAll(c1, i -> Integer.parseInt(sc.next()));
        Arrays.setAll(c2, i -> Integer.parseInt(sc.next()));
        Arrays.setAll(c3, i -> Integer.parseInt(sc.next()));
        sc.close();

        // 主処理
        Integer[] vertical = new Integer[] { c1[0] - c1[0], c2[0] - c1[0], c3[0] - c1[0] };

        Integer[] newC1 = new Integer[] { vertical[0] + c1[0], vertical[0] + c1[1], vertical[0] + c1[2] };
        Integer[] newC2 = new Integer[] { vertical[1] + c1[0], vertical[1] + c1[1], vertical[1] + c1[2] };
        Integer[] newC3 = new Integer[] { vertical[2] + c1[0], vertical[2] + c1[1], vertical[2] + c1[2] };

        boolean judge1 = Arrays.equals(c1, newC1);
        boolean judge2 = Arrays.equals(c2, newC2);
        boolean judge3 = Arrays.equals(c3, newC3);
        boolean judge = judge1 && judge2 && judge3;
        String result = judge ? "Yes" : "No";

        // 出力
        System.out.println(result);
    }
}
