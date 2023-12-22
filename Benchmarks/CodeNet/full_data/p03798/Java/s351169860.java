import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        String str = "";
        final char SHEEP = 'S';
        final char WOLF = 'W';
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(br.readLine());
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int[][] result = new int[4][n];
        result[0][0] = result[1][0] = result[0][n-1] = result[2][n-1] = 1;
        result[1][n-1] = result[2][0] = result[3][0] = result[3][n-1] = -1;
        char tmp;
        for (int i = 0; i < str.length(); i++) {
            int prev = (i-1) < 0 ? n - 1: i- 1;
            int next = (i+1) == n ? 0 : i+1;
            tmp = str.charAt(i);
            for (int[] trg : result) {
                if (trg[next] == 0) {
                    if (trg[i] == 1) {
                        if (tmp == 'o') {
                            trg[next] = trg[prev];
                        } else {
                            trg[next] = -trg[prev];
                        }
                    } else {
                        if (tmp == 'x') {
                            trg[next] = trg[prev];
                        } else {
                            trg[next] = -trg[prev];
                        }
                    }
                }
                else {
                    if (trg[i] == 1) {
                        if (tmp == 'o') {
                            if(trg[next] != trg[prev])
                                trg[next] = 2;
                        } else {
                            if(trg[next] != -trg[prev])
                                trg[next] = 2;
                        }
                    } else {
                        if (tmp == 'x') {
                            if(trg[next] != trg[prev])
                                trg[next] = 2;
                        } else {
                            if(trg[next] != -trg[prev])
                                trg[next] = 2;
                        }
                    }
                }
            }
        }
        boolean flg = true;
        for (int[] i:result) {
            for (int j : i) {
                if (j == 2) {
                    flg = false;
                }
            }
            if (flg) {
                for (int j : i) {
                    if (j == 1)
                        System.out.print(SHEEP);
                    else
                        System.out.print(WOLF);
                }
                break;
            }
        }
        if (!flg) System.out.print(-1);
        System.out.println();
    }
}