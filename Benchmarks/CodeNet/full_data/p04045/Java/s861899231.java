

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[k];
        for (int i=0; i<k; i++){
            arr[i] = sc.nextInt();
        }
        
        for (int i=0; n<9999; i++){
            if (i != 0){
                n += 1;
            }
            int count = 0;
            for (int j=0; j<arr.length; j++){
                if (String.valueOf(n).indexOf(String.valueOf(arr[j])) == -1){
                    count++;
                }
            }
            if (count == arr.length){
                break;
            }
        }

        System.out.println(n);
    }
}