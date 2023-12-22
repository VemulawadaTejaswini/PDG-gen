// 2017/12/10


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
        int N = Integer.parseInt(br.readLine().trim());
        int[] x = new int[2*N];
        int[] y = new int[2*N];
        for(int i=0; i<2*N; i++){
            x[i] = 0;
            y[i] = 0;
        }
        int a = 0;
        int c = 0;
        int[] arr = inputval();
        int off_min = 0;
        int off_max = N-1;
        int maxabs;
        int mindex=0;
        int mval;
        while(off_min <= off_max) {
            maxabs = 0;
            //mindex;
            mval = 0;
            for (int i = off_min; i <= off_max; i++) {
                if (Math.abs(arr[i]) > maxabs) {
                    maxabs = Math.abs(arr[i]);
                    mindex = i;
                    mval = arr[i];
                }
            }

            if (mval == 0) break;
            else if (mval > 0) {
                arr[off_max] += mval;
                x[c] = mindex + 1;
                y[c] = off_max + 1;
                c++;
                if (arr[off_max] >= mval){
                    while(true){
                        a = off_max;
                        if(a+1 >= N) break;
                        if(arr[a] <= arr[a+1]) break;
                        while(arr[a] > arr[a+1]){
                            arr[a+1] += arr[a];
                            x[c] = a;
                            y[c] = a+1;
                            c++;
                        }
                        a++;
                    }

                    off_max--;
                }
            } else {
                arr[off_min] += mval;
                x[c] = mindex + 1;
                y[c] = off_min + 1;
                c++;
                if(arr[off_min] <= mval){
                    while(true){
                        a = off_min;
                        if(a-1 <= 0) break;
                        if(arr[a-1] <= arr[a]) break;
                        while(arr[a-1] > arr[a]){
                            arr[a-1] += arr[a];
                            x[c] = a;
                            y[c] = a-1;
                            c++;
                        }
                        a++;
                    }

                    off_min++;
                }
            }
        }
        System.out.println(c);
        for(int i=0; i<c; i++){
            System.out.println(x[i] + " " + y[i]);
        }

        /*int flag = 0;
        for(int i=0; i<N; i++){
            while((flag==0&&arr[off_min]>min) || (flag==1&&arr[off_max]<max)) {
                flag = 0;
                min = Integer.MAX_VALUE;
                max = Integer.MIN_VALUE;
                for (int j = off_min; j <= off_max; j++) {
                    if (arr[j] < min) min = arr[i];
                }
                if (min > 0) {
                    flag = 1;
                    for (int j = off_min; j >= off_min; j++) {
                        if (arr[j] > max) max = arr[i];
                    }
                    arr[off_max] += max;
                    continue;
                } else {
                    arr[off_min] += min;
                    if(arr[off_min] -= )
                }
            }
        }*/
    }
}