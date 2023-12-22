import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static int N;
    static HashMap<String, Long> m;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        scanner.nextLine();

        long cnt = 0;
        m = new HashMap<>();
        for(int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            ArrayList<Character> list = new ArrayList<>();
            for(int j = 0; j < 10; j++) {
                list.add(line.charAt(j));
            }
            Collections.sort(list);
            StringBuilder sb = new StringBuilder();
            for(Character c: list) {
                sb.append(c);
            }
            String srt = sb.toString();
            if(m.containsKey(srt)) {
                cnt += m.get(srt);
                m.put(srt, m.get(srt) + 1);
            } else {
                m.put(srt, (long) 1);
            }
        }

        System.out.println(cnt);
        scanner.close();
    }


    public static void main(String args[]) {
        init();
    }
}
