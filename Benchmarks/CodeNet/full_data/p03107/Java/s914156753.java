

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int zero = 0;
        int ichi = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '0') zero++;
            else ichi++;
        }
        int res = 2 * Math.min(zero, ichi);
        System.out.println(res);
    }
}
