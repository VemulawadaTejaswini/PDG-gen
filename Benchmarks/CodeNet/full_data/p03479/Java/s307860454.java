

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        long[] arr = inputval();
        long X,Y;
        X = arr[0];
        Y = arr[1];
        int ans;
        if(arr[0] > arr[1]) ans = 0;
        else ans = (int)(Math.log(Y/X)/Math.log(2)) + 1;
        System.out.println(ans);
    }


    static long[] inputval() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        long[] intarray = new long[strarray.length];
        for (int i = 0; i < intarray.length; i++) {
            intarray[i] = Long.parseLong(strarray[i]);
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