import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        String[] list = new String[N];
        int answer = 0;
        boolean[] firstB = new boolean[N];
        boolean[] lastA = new boolean[N];
        boolean[] bothBA = new boolean[N];
        int firstmatchcount = 0;
        int lastmatchcount = 0;
        int bothmatchcount = 0;
        for (int i = 0; i < N; i++) {
            String temp = scan.next();
            list[i] = temp;
            int count = 0;
            boolean foundA = false;
            char[] data = temp.toCharArray();
            if (data[0] == 'B' && data[data.length-1] != 'A') {
                firstB[i] = true;
                firstmatchcount += 1;
            }
            if (data[0] != 'B' && data[data.length-1] == 'A') {
                lastA[i] = true;
                lastmatchcount += 1;
            }
            if (data[0] == 'B' && data[data.length - 1] == 'A') {
                bothBA[i] = true;
                bothmatchcount += 1;
            }
            for(char c : temp.toCharArray()) {
                if (c == 'A') {
                    foundA = true;
                    continue;
                }
                if (!foundA) {
                    continue;
                }
                if (c == 'B') {
                    count += 1;
                }
                foundA = false;
            }
            answer += count;
        }
        int add = 0;
        if (bothmatchcount == 0) {
            add = Math.min(firstmatchcount, lastmatchcount);
        } else {
            if (0 == Math.min(firstmatchcount, lastmatchcount)) {
                add = bothmatchcount - 1;
            } else {
                add = bothmatchcount + Math.min(firstmatchcount, lastmatchcount);
            }
        }
        System.out.println(answer);
    }
}
