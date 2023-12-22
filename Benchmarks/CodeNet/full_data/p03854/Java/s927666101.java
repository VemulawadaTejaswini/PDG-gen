import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        String s = sc.next();

        String[] arr = {"dreamer", "dream", "eraser", "erase"};

        outer:
        while (0 < s.length()) {
            int cnt = 0;
            for (int i=0; i<4; i++) {
                if (s.startsWith(arr[i])) {
                    if (s.length() <= arr[i].length()) break outer;
                    if (s.charAt(arr[i].length()) != 'd' && s.charAt(arr[i].length()) != 'e') continue ;
                    s = s.substring(arr[i].length(), s.length());
//                    System.out.println(s);
                    continue outer;
                }
                cnt++;
            }
            if (cnt == 4) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

}

