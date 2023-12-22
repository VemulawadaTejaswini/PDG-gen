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
        if(mini + 1 < k||(n - k) < mini){
            System.out.println((int)Math.ceil((double)(n - 1) / (k - 1)));
            return;
            //5 2 3 1 4
        }
        if(n == k){
            System.out.println(1);
            return;
        }
        int l1 = (int)Math.ceil((double)mini / (k - 1));
        int l2 = (int)Math.ceil((double)(n - (mini + 1)) / (k - 1));

        System.out.println(l1 + l2);
    }



}
