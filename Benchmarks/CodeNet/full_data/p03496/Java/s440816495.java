

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static long[] inputval() throws Exception {
        String[] strarray = br.readLine().trim().split(" ");
        long[] intarray = new long[strarray.length];
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

    static void array_sout(long[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(br.readLine().trim());
        long[] arr = inputval();
        long maxabs=0;
        int mindex=0;
        long mval=0;
        int c = 0;
        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(Math.abs(arr[i]) > maxabs){
                maxabs = Math.abs(arr[i]);
                mindex = i;
                mval = arr[i];
            }
        }
        if(mval == 0) {
            System.out.println(0);
            return;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i != mindex) {
                    arr[i] += mval;
                    x.add(mindex);
                    y.add(i);
                    c++;
                }
            }
        }
        if(mval > 0){
            for(int i=0; i<arr.length-1; i++){
                arr[i+1] += arr[i];
                x.add(i);
                y.add(i+1);
                c++;
            }
        }else {
            for(int i=arr.length-1; i>0; i--){
                arr[i-1] += arr[i];
                x.add(i);
                y.add(i-1);
                c++;
            }
        }
        System.out.println(c);
        for(int i=0; i<x.size(); i++){
            System.out.println(x.get(i) + " " + y.get(i));
        }
        array_sout(arr);
    }
}