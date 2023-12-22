import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//500
        int b = sc.nextInt();//100
        int c = sc.nextInt();//50

        int x = sc.nextInt();
//        int a = 2;
//        int b = 2;
//        int c = 2;
//
//        int x = 100;

        int cnt = 0;
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= b; j++) {
                for (int k = 0; k <= c; k++) {
                    int total = i * 500 + j * 100 + k * 50;
                    if(total == x){
                        cnt += 1;
                    }
                }
            }
        }


        System.out.println(cnt);

    }
}
