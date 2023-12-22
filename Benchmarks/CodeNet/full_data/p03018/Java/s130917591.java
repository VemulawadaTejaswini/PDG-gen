import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            String s = in.next();
            char[] cs = s.toCharArray();
            int count = 0;
            for (int i = 0; i < cs.length; i++) {
                if (i < 0) {
                    continue;
                }
                if (i + 1 < cs.length && cs[i] == 'B' && cs[i + 1] == 'C') {
                    for (int j = i - 1; j >= 0; j--) {
                        if (cs[j] == 'A') {
                            count++;
                            char swap = cs[j];
                            cs[j] = cs[j + 1];
                            cs[j + 1] = cs[j + 2];
                            cs[j + 2] = swap;
                        } else {
                            break;
                        }
                    }
//                    i -= 2;
                } else {
                    continue;
                }
//                if (cs[i] == 'A') {
//                    if (i + 2 < cs.length && cs[i + 1] == 'B' && cs[i + 2] == 'C') {
//                        count++;
//                        char swap = cs[i];
//                        cs[i] = cs[i + 1];
//                        cs[i + 1] = cs[i + 2];
//                        cs[i + 2] = swap;
//                        i -= 2;
//                    } else {
//                        continue;
//                    }
//                }
            }
            System.out.println(count);
        }
    }
}
