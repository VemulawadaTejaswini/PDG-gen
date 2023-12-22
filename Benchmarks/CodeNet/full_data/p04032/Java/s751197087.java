import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if(isUnbalanced(getAlphabetCount(str))) {
            String s = str.substring(2, 3);
            int start = 3;
            while(!isUnbalanced(getAlphabetCount(s))) {
                s = str.substring(2, ++start);
            }
            System.out.println("2 " + (start + 1));
        } else {
            System.out.println("-1 -1");
        }
    }

    private static boolean isUnbalanced(int[] alphabetCount) {
        int std = -1;
        for (int i = 0; i < 26; i++) {
            if(alphabetCount[i] == 0) continue;

            if (std == -1) {
                std = alphabetCount[i];
            }
            if(std != alphabetCount[i]) {
                return true;
            }
        }
        return false;
    }

    private static int[] getAlphabetCount(String str) {
        int alphabetCount[] = new int[26];
        for (int i = 0, max = str.length(); i < max; i++) {
            int index = str.charAt(i) - 'a';
            alphabetCount[index]++;
        }
        return alphabetCount;
    }
}