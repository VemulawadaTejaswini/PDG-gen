import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] S = in.nextLine().toCharArray();
        
        char[] T = in.nextLine().toCharArray();
        int max = 0;
        int count = 0;
        tag : for (int i = 0; i < S.length; i++) {
            counter : for (int j = 0; j < T.length; j++) {
                if (S.length % T.length == 0 && count == S.length / T.length) {
                    max = -1;
                    break tag;
                }
                if (i + j + j * count < S.length) {
                    if (T[j] != S[i + j + j * count]) {
                        if (max < count) {
                            max = count;
                        }
                        count = 0;
                        continue tag;
                    }
                    if (j + 1 == T.length) {
                        count++;
                        continue counter;
                    }
                } else {
                    if (T[j] != S[i + j - S.length + j * count]) {
                        if (max < count) {
                            max = count;
                        }
                        i += count * j;
                        count = 0;
                        continue tag;
                    }
                    if (j + 1 == T.length) {
                        count++;
                        continue counter;
                    }
                }
            }
        }
        System.out.println(max);

    }
}
