

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int[] arr = inputval();
        int N=arr[0];
        int C = arr[1];
        int[][] bangumi = new int[N][3];
        for(int i=0; i<bangumi.length; i++){
            bangumi[i] = inputval();
        }
        int[] tt = new int[100000];
        int[] sm = new int[100000];
        for(int i=0; i<sm.length; i++){
            sm[i] = 0;
        }
        int maxval = 0;
        for(int i=1; i<=C; i++){
            for(int j=0; j<tt.length; j++){
                tt[j] = 0;
            }
            for(int j=0; j<bangumi.length; j++){
                if(bangumi[j][2] == i){
                    if(tt[bangumi[j][0]-1]==0) tt[bangumi[j][0]-1] = -1;
                    for(int k=bangumi[j][0]; k<bangumi[j][1]; k++){
                        tt[k] = 1;
                    }
                }
            }
            for(int j=0; j<tt.length; j++){
                if(tt[j] == -1){
                    if(sm[j] <= 0){
                        sm[j]--;
                    }else{
                        sm[j]++;
                    }
                }else if(tt[j] == 1){
                    if(sm[j] <= 0) {
                        sm[j] = -sm[j];
                    }
                    sm[j]++;
                }
                if(sm[j] > maxval) maxval = sm[j];
            }
        }
        System.out.println(maxval);

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