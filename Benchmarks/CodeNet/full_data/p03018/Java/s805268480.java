import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 文字列の入力
        String s = sc.next();
        sc.close();
        s = s.replace("BC", "D");
        StringBuilder sb = new StringBuilder();
        sb.append(s);

        int counter = 0;
        int i = 0;

        if (s.length() < 2) {
            counter = 0;
        } else {
            while (sb.length() - 1 > i) { // O(N)
                if (sb.charAt(i) == 'A' && sb.charAt(i + 1) == 'D') {
                    sb.replace(i, i + 2, "DA");
                    counter++;
                    if (i > 1) {
                        int j = i-1;
                        while (sb.charAt(j) == 'A') {
                            sb.replace(j, j + 2, "DA");
                            counter++;
                            if (j == 0) {
                                break;
                            }
                            j--;
                        }
                    }
                }
                i++;
            }

        }

        // 出力
        System.out.println(counter);
    }

}
