import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int n = s.length;
        int res = 0;
        for(int i=0; i<(n-1-i); i++) {
            if(s[i] != s[n-1-i]) {
                res++;
            }
        }

        System.out.println(res);
    }
}
