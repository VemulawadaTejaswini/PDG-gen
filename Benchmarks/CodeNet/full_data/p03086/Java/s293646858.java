

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String longest = "";
        for (int i=0; i<S.length(); i++) {
            for (int j=i+1; j<=S.length(); j++) {
                String temp = S.substring(i,j);
                if (check(temp) && temp.length()>longest.length()) {
                    longest = temp;
                }
            }
        }
        System.out.println(longest.length());
    }
    public static boolean check (String S) {
        for (int i=0; i<S.length(); i++) {
            if (S.charAt(i)!='A' && S.charAt(i)!='C' && S.charAt(i)!='G' && S.charAt(i)!='T') {
                return false;
            }
        }
        return true;
    }
}
