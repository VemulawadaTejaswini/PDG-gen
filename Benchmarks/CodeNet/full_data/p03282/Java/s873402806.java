

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();

        int inchiNum = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                inchiNum++;
            } else {
                break;
            }
        }
        if(inchiNum >= k) System.out.println("1");
        System.out.println(s.charAt(inchiNum));
    }
}
