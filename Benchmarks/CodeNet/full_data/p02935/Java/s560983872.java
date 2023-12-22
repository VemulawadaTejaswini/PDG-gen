import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int num = 1;
        int b = 0;
        float max = -9999;
        for (int i = 1; i <= 2; i++) {
            num = num * (a - i + 1) / i;
        }
        int[] numarray = new int[a];
        float[] resultarray = new float[num];

        for (int i = 0; i < a; i++) {
            numarray[i] = sc.nextInt();
        }
        for (int j = 0; j < numarray.length; j++) {
            for (int k = j + 1; k < numarray.length; k++) {
                resultarray[b] = (float) (numarray[j] + numarray[k]) / 2;
                b++;
            }
        }
        for (int d = 0; d < resultarray.length; d++) {
            if (resultarray[d] > max) {
                max = resultarray[d];
            }
        }
        System.out.println(max);
    }
}
