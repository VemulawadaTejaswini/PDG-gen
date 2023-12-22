import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int array[] = new int[n];
        int mini = -1;
        for (int i = 0;i < n;++i){
            array[i] = sc.nextInt();
            if(array[i] == 1)mini = i;
        }
        int kk1 = k - 1;
        int a1 = mini;
        int a2 = (n - mini - 1);
        if(a1 < kk1||a2 < kk1){
            System.out.println((int)Math.ceil((double)(n - 1) / kk1));
            return;
        }
        System.out.println((int)Math.ceil((double)a1 / kk1) + (int)Math.ceil((double)a2 / kk1));


    }




}
