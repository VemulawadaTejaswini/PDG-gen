

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int len = S.length();
        int num = 0;
        for (int i = 0; i < len - 3; i++) {
            if(S.charAt(i) == 0){
                continue;
            }
            for (int j = i+3; j < len; j++) {
                if (S.charAt(i) == 1) {
                    j++;
                }

                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum * 10 + (S.charAt(k)-'0');
                }
                if (sum % 2019 == 0) {
                    num++;
                }
            }
        }

        System.out.println(num);
    }

}
