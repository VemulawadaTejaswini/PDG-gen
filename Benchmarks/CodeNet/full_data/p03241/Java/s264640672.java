
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n == 1){
            System.out.println(m);
            return;
        }
        else if(n == 2){
            if(m % 2 == 0) System.out.println(m / 2);
            else System.out.println(1);
            return;
        }
        int s = 1;
        for (int i = 1;i <= m / n;++i){
            if(m % i == 0){
                s = i;
            }
        }
        System.out.println(s);
    }




}


