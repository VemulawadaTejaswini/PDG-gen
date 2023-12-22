
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = 1;
        double f = m / n;
        double t = Math.sqrt(f);
        for (int i = 1;i <= t;++i){
            if(m % i == 0){
                int k = (int)f / i;
                if(k <= f){
                    if(s < k)s = k;
                }
                else if(s < i)s = i;
            }
        }
        System.out.println(s);
    }




}


