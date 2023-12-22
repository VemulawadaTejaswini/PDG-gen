

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int digitNum = (int)Math.log10(N) + 1;

        int ans = 0;
        if(digitNum == 6){
            ans = 9 + 900 + 90000;
        }else if(digitNum == 5){
            ans = 9 + 900 + N - 10000 + 1;
        }else if(digitNum == 4){
            ans = 9 + 900;
        }else if(digitNum == 3){
            ans = 9 + N - 100 + 1;
        }else if(digitNum == 2){
            ans = 9;
        }else if(digitNum == 1){
            ans = N;
        }
        System.out.println("" + ans);
    }

}
