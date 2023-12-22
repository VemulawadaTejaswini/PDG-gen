import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String S = scanner.next();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < S.length() - 2; i++) {
            if(i > 1 && S.charAt(i) == S.charAt(i-1) && S.charAt(i-1) == S.charAt(i-2)){
                continue;
            }
            for (int j = i + 1; j < S.length() - 1; j++) {
                for (int k = j + 1; k < S.length(); k++) {
                    map.put(S.charAt(i) + String.valueOf(S.charAt(j)) + S.charAt(k), 1);

                }
            }
        }
        System.out.println(map.size());
    }
}
