import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Math.*;

public class Main {


    private static String input;
    private static ArrayList<ArrayList<Integer>> dp;
    private static int mod = (int) (1e9 + 7);
    private static String s1, s2;
    private static InputReader inputReader = new InputReader();


    static String n;
    static int[] arr = new int[11];

    static void solve() {
        String ans = "";
        int loValue = 0;
        for (int i = 1; i <= 9; i++) {
            if (arr[i] == 0) {
                char c = (char) ('0' + i);
                ans = ans + c;
                loValue = i;
                break;
            }
        }
        if (arr[0] == 0)
            loValue = 0;
        for (int i = 0; i < n.length(); i++) {
            char c = (char) ('0' + loValue);
            ans = ans + c;
        }
        System.out.println(ans);;
    }

    public static void main(String[] args) throws IOException {

        int l;
        String[] temp = inputReader.readStringFromLine().split(" ");
        n = temp[0];
        l = Integer.parseInt(temp[1]);

        List<Integer> digits = inputReader.readIntegersFromLine();

        for (int i = 0;i < l; i++) {
            arr[digits.get(i)] = 1;
        }
        int flag = 0;
        String ans = "";
        for (int i = 0;i < n.length(); i++) {
            if (flag == 0 ) {
                int flag2 = 0;
                for (int j = n.charAt(i) - '0';j <= 9; j++) {
                    if (arr[j] == 0) {
                        flag2 = 1;
                        if (j > n.charAt(i) - '0') {
                            flag = 1;
                        }
                        char c = (char) ('0' + j);
                        ans = ans + c;
                        break;
                    }
                }
                if (flag2 == 0) {
                    solve();
                    return ;
                }
            } else {
                int flag2 = 0;
                for (int j = 0;j <= 9; j++) {

                    if (arr[j] == 0) {
                        if (j > n.charAt(i) - '0') {
                            flag = 1;
                        }
                        flag2 = 1;
                        char c = (char) ('0' + j);
                        ans = ans + c;
                        break;
                    }
                }
                if (flag2 == 0) {
                    solve();
                    return ;
                }
            }
        }
        System.out.println(ans);;
    }


    private static class InputReader {

        private static BufferedReader bufferedReader;

        public InputReader() {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        }

        public String readStringFromLine() throws IOException {
            return bufferedReader.readLine().trim();
        }

        public int readSingleIntFromLine() throws IOException {
            return Integer.parseInt(bufferedReader.readLine().trim());
        }

        public List<Integer> readIntegersFromLine() throws IOException {
            final List<Integer> integerList = new ArrayList<>();
            for (String integer : bufferedReader.readLine().trim().split(" ")) {
                integerList.add(Integer.parseInt(integer));
            }

            return integerList;
        }

        public List<Long> readLongsFromLine() throws IOException {
            final List<Long> integerList = new ArrayList<>();
            for (String integer : bufferedReader.readLine().trim().split(" ")) {
                integerList.add(Long.parseLong(integer));
            }

            return integerList;
        }
    }

}



