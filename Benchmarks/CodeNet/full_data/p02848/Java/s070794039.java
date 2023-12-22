import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] ch = new char[s.length()];
        for(int i=0; i<ch.length; i++) {
            ch[i] = s.charAt(i);
        }
        for(int i=0; i<ch.length; i++) {
            int c = ch[i];
            if(c+n > 90) {
                c = c - 26 + n;
            } else {
                c = ch[i] + n;
            }
            System.out.print((char)(c));
        }
        System.out.println();
    }
}