import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        exec(args);
    }

    public static void exec(String[] args) {
        String str = readLineStandardInput();
        int N = Integer.parseInt(str);
        str = readLineStandardInput();
        String[] Astr = str.split(" ");
        int sum = 0;
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            int tmp = Integer.parseInt(Astr[i]);
            A[i] = tmp;
            sum += tmp;
        }
        double qSum = sum / 4.0;
        boolean[] test0 = new boolean[] {true, true, true, true};
        boolean[] test1 = new boolean[] {false, true, true, true};
        boolean[] test2 = new boolean[] {true, false, true, true};
        boolean[] test3 = new boolean[] {false, false, true, true};
        boolean[] test4 = new boolean[] {true, true, false, true};
        boolean[] test5 = new boolean[] {false, true, false, true};
        boolean[] test6 = new boolean[] {true, false, false, true};
        boolean[] test7 = new boolean[] {false, false, false, true};
        int min = Integer.MAX_VALUE;
        {
            int val = calcSumSet(A, qSum, test0);
            min = min > val ? val : min;
        }
        {
            int val = calcSumSet(A, qSum, test1);
            min = min > val ? val : min;
        }
        {
            int val = calcSumSet(A, qSum, test2);
            min = min > val ? val : min;
        }
        {
            int val = calcSumSet(A, qSum, test3);
            min = min > val ? val : min;
        }
        {
            int val = calcSumSet(A, qSum, test4);
            min = min > val ? val : min;
        }
        {
            int val = calcSumSet(A, qSum, test5);
            min = min > val ? val : min;
        }
        {
            int val = calcSumSet(A, qSum, test6);
            min = min > val ? val : min;
        }
        {
            int val = calcSumSet(A, qSum, test7);
            min = min > val ? val : min;
        }
        System.out.println(min);
    }

    public static int calcSumSet(int[] src, double maxVal, boolean[] isOverOk) {
        int[] PQRS = new int[4];
        int PQRSIdx = 0;
        for(int srcIdx = 0; srcIdx < src.length; srcIdx++) {
            PQRS[PQRSIdx] += src[srcIdx];
            if(PQRSIdx >= 3) {
                continue;
            }
            if(isOverOk[PQRSIdx]) {
                if(PQRS[PQRSIdx] > maxVal) {
                    PQRSIdx++;
                }
            }
            else {
                if(PQRS[PQRSIdx] > maxVal) {
                    PQRS[PQRSIdx] -= src[srcIdx];
                    PQRSIdx++;
                    srcIdx--;
                }
            }
            if(PQRSIdx == 2 && srcIdx == src.length - 2) {
                PQRSIdx++;
            }
            else if(PQRSIdx == 1 && srcIdx == src.length - 3) {
                PQRSIdx++;
            }
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int val : PQRS){
            min = min > val ? val : min;
            max = max < val ? val : max;
        }
        int res = max - min;
        return res;
    }

    private static String readLineStandardInput() {
        String str;
        try {
            str = input.readLine();
        } catch(IOException e){
            str = null;
            System.out.println(e);
        }
        return str;
    }
}
