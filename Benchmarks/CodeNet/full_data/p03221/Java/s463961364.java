import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inStr = br.readLine().split(" ");
        int N = Integer.parseInt(inStr[0]);
        int M = Integer.parseInt(inStr[1]);
        int[][] arr = new int[M][2];
        int[] year = new int[M];
        for (int i = 0; i < M; i++) {
            inStr = br.readLine().split(" ");
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(inStr[j]);
            }
            year[i] = arr[i][1];
        }
        Arrays.sort(year);

        for (int i = 0; i < M; i++) {
            int num = 0;
            int k = 0;
            for (int j = 0; j < M; j++) {
                if (arr[i][0] == arr[j][0]) {
                    k++;
                }
            }
            for (int j = 0; j < M; j++) {
                if (year[j] == arr[i][1]) {
                    num = j;
                }
            }
            System.out.println(getId(arr[i][0]) + getId(Math.min(num, k - 1) + 1));
        }
    }

    private static String getId(int num) {
        String str = String.valueOf(num);
        String pNum = "";
        if (str.length() < 6) {
            for (int i = 0; i < 6 - str.length(); i++) {
                pNum += "0";
            }
            pNum += str;
        } else {
            pNum = str;
        }
        return pNum;
    }
}
