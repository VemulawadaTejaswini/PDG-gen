import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] characters = s.toCharArray();

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (characters[i] == characters[j]) {
                    int cnt = 1;
                    for (int k = 1; k < n - j; k++) {
                        if (characters[i + k] == characters[j + k]) {
                            cnt++;
                        } else {
                            if (result < cnt) {
                                result = cnt;
                            }
                            break;
                        }
                    }
                }
            }
        }

        System.out.println(cnt);
    }
}