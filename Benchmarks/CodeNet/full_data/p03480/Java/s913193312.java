

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        String S = br.readLine().trim();
        int l, r;
        int count = 0;
        l = (S.length() + 1) / 2 - 1;
        r = S.length() / 2;
        //中央の文字がどのくらい連続しているか
        for (int n = 0; n <= 1; n++) {
            l = (S.length() + 1) / 2 - 1;
            r = S.length() / 2;
            while (l >= 0) {
                if (S.charAt(l) == '0'+n && S.charAt(r) == '0'+n){
                    count += 2;
                    l--;
                    r++;
                }
                else break;
            }
        }
        //中央の項の修正
        if (S.length() % 2 == 1) count--;
        count += (S.length() - count) / 2;
        System.out.println(count);
    }


    static int[] inputval() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        int[] intarray = new int[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Integer.parseInt(strarray[i]);
        }
        return intarray;
    }

    static void array_sout(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void array_sout(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}