import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        // 整数の入力
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();

        String s = sc.next();
        list.add(s);
        String lastWord = s.split("")[s.length() - 1];

        boolean ruled = true;

        // 文字列の入力
        for(int i = 1; i < n; i++) {
            String value = sc.next();
            if (list.contains(value)) {
                ruled = false;
                break;
            } else if (!value.substring(0, 1).equals(lastWord)) {
                ruled = false;
                break;
            }
            lastWord = value.split("")[value.length() - 1];
            list.add(value);
        }

        // 出力
        System.out.println(ruled ? "Yes" : "No");
    }
}