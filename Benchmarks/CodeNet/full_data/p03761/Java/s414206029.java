import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[26];
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
            int[] b = new int[26];
            for (int j = 0; j < s[i].length(); j++) {
                char c = s[i].charAt(j);
                if(i == 0) {
                    a[c - 'a']++;
                } else {
                    b[c - 'a']++;
                }
            }
            if(i != 0) {
                for (int j = 0; j < 26; j++) {
                    a[j] = Math.min(a[j], b[j]);
                }
            }
        }
        for (int i = 0; i < 26; i++) {
            int c = a[i];
            if(c != 0) {
                for (int j = 0; j < c; j++) {
                    System.out.print(Character.valueOf((char) ('a' + i)));
                }
            }
        }
    }
}