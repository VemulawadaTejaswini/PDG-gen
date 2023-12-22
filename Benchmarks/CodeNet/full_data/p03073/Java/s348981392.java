import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int length = input.length();
        char[] S = new char[length];
        for (int i = 0; i < length; i++) {
            S[i] = input.charAt(i);
        }

        int count1 = countToZeroFirst(S);
        int count2 = countToOneFirst(S);

        if (count1 < count2) {
            System.out.println(count1);
        }
        else {
            System.out.println(count2);
        }
    }

    private  static int countToZeroFirst(final char[] S) {
        int changeCount = 0;
        for (int i = 0; i < S.length; i++) {
            if (i % 2 == 0) {
                if (S[i] == '1') {
                    changeCount++;
                }
            }
            else {
                if (S[i] == '0') {
                    changeCount++;
                }
            }
        }
        return changeCount;
    }
    private  static int countToOneFirst(final char[] S) {
        int changeCount = 0;
        for (int i = 0; i < S.length; i++) {
            if (i % 2 == 0) {
                if (S[i] == '0') {
                    changeCount++;
                }
            }
            else {
                if (S[i] == '1') {
                    changeCount++;
                }
            }
        }
        return changeCount;
    }
}
