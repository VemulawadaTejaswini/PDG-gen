import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String S = scan.next();
        S = S.replaceAll("BC", "D");
        char[] data = S.toCharArray();
        int length = data.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (data[i] == 'A') {
                list.add(1);
                continue;
            }
            if (data[i] == 'D') {
                list.add(2);
                continue;
            }
            list.add(3);
        }
        int answer = 0;
        int a = 0;
        for (int x : list) {
            if (x == 1) {
                a += 1;
                continue;
            }
            if (x == 2) {
                answer += a;
                continue;
            }
            if (x == 3) {
                a = 0;
            }
        }
        System.out.println(answer);
    }
}
