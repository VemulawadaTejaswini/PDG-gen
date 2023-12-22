import java.util.Scanner;
import java.util.Arrays;

class Main {
    static void combination_table(long c[][], int N) {
        for(int i = 0; i <= N; ++i) {
            for(int j = 0; j <= i; ++j) {
                if(j == 0 || j == i) {
                    c[i][j] = 1;
                }
                else {
                    c[i][j] = (c[i-1][j-1] + c[i-1][j]);
                }
            }
        }
    }
    static  void reverse(int arr[]) {
        for(int i = 0 ; i < arr.length / 2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }
    static long combination[][] = new long[51][51];

    public static void main(String args[]) {

        int N,A,B;
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        int array[] = new int[N];
        for(int i = 0; i < N ; i++) {
            array[i] = sc.nextInt();
        }
        combination_table(combination,N);
        Arrays.sort(array);
        reverse(array);
        int sum = array[0];
        for(int i = 1; i < A; i++) {
            sum += array[i];
        }
        double average = sum / A;
        
        int a_th_val_num = 0, a_th_pos = 0;
        for(int i = 0; i < N ; i++){
            if(array[i] == array[A-1]){
                a_th_val_num++;
                if(i < A) a_th_pos++;
            }
        }
        long count = 0;
        if(a_th_pos == A) {
            for(a_th_pos = 0; a_th_pos <= B; a_th_pos++) {
                count += combination[a_th_val_num][a_th_pos];
            }

        }
        else {
            count += combination[a_th_val_num][a_th_pos];
        }
        System.out.printf("%.20f\n%d\n",average, count);
    }

}