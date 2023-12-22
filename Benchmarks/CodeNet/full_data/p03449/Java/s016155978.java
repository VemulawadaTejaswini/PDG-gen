import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(input.readLine());

        int[][] values = new int[2][n];
        int[][] valuesSum = new int[2][n];

        StringTokenizer tokenizer;

        for (int i = 0; i < 2; i++) {
            tokenizer = new StringTokenizer(input.readLine());
            for (int j = 0; j < n; j++) {
                values[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }

        valuesSum[0][0] = values[0][0];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                    valuesSum[i][j] = values[i][j] + Math.max(getValues(i - 1, j, valuesSum), getValues(i, j - 1, valuesSum));
            }
        }

        System.out.println(valuesSum[1][n- 1]);

    }



    public static boolean checkIndex (int x, int y, int n){
        return x > -1 && y > -1 && x < 2 && y < n;
    }

    public static int getValues(int x, int y, int [][] values){

        if (checkIndex(x, y, values[0].length)){
            return values[x][y];
        }

        return 0;

    }
}
