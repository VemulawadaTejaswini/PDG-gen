import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String abc = "abcdefghijklmnopqrstuvwxyz";

        int[][] alphcnt = new int[ n ][ 26 ];
        for(int i = 0 ; i < n ; i ++){
            String S = sc.next();
            for (int j = 0; j < S.length(); j++) {
                alphcnt[i][abc.indexOf(String.valueOf(S.charAt(j)))]++;
            }
        }

        int[] alphMin = {50,50,50,50,50,50,50,50,50,50,
                         50,50,50,50,50,50,50,50,50,50,
                         50,50,50,50,50,50,} ;
        for (int j = 0; j < 26 ; j++) {
            for (int i = 0; i < n; i++) {
                if (alphcnt[ i ][ j ] < alphMin[ j ]) {
                    alphMin[j] = alphcnt[i][j];

                }
            }
        }
        StringBuilder result = new StringBuilder();
        for(int j = 0 ; j < 26 ; j ++){
            for (int k = 0; k < alphMin[j]; k++) {
                result.append(String.valueOf(abc.charAt(j)));
            }
        }
        System.out.println(result);

    }
}
