

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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

    public static void main(String[] args) throws Exception {
        int num = Integer.parseInt(br.readLine().trim());
        int[] arr = inputval();
        int[] counter = new int[num];
        for(int i=0; i<num; i++) counter[i] = 0;
        for(int i=0; i<num; i++){
            while(arr[i]%2 != 1){
                arr[i] /= 2;
                counter[i]++;
            }
        }
        int minnum=Integer.MAX_VALUE;
        for(int i=0; i<num; i++){
            if(counter[i]<minnum) minnum = counter[i];
        }
        System.out.println(minnum);
    }
}