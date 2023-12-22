import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int[] map = new int[1000000];
        int x = 0;
        char which = S.charAt(0);
        map[x] = 1;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == which) {
                map[x]++;
            } else {
                which = S.charAt(i);
                x++;
                map[x]++;
            }
        }
        int ans = 0;
        boolean bigger = false;
        if (S.charAt(0) == '<') bigger = true;
        if(!bigger) ans += map[0];
        for (int i = 0; 0 != map[i]; i++) {
            for (int j = 1; j < map[i]; j++) {
                ans += j;
            }
            if(bigger && map[i+1] != 0) {
                ans += Math.max(map[i], map[i+1]);
            }else if(bigger && map[i+1] == 0){
                ans += map[i];
                break;
            }
            bigger = !bigger;
        }

        System.out.println(ans);
    }

}