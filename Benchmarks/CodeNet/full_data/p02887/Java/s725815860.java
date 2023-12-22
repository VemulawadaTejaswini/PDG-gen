

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        int res = 1;
        for(int i = 1; i < str.length(); i++) {
            if(str.charAt(i) != str.charAt(i-1)) res++;
        }
        System.out.println(res);
    }
}
