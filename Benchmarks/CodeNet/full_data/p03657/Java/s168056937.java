/**
 * Created by ko_ji on 2017/09/10.
 */

import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String args[]){
        int A[] = new int[2];

        Scanner sc = new Scanner(System.in);
        A[0] = sc.nextInt();
        A[1] = sc.nextInt();
        int c = A[0] + A[1];

        if (A[0] % 3 == 0 || A[1] % 3 == 0 || c % 3 == 0) {
            System.out.println("Possible");
        }else{
            System.out.println("Impossible");
        }


    }
}