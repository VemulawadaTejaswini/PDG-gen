import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt()-1, b = sc.nextInt()-1, c = sc.nextInt()-1, d = sc.nextInt()-1;
        char[] S = sc.next().toCharArray();
        String res = "Yes";
        for(int i = a; i < c - 1; i++) {
            if(S[i + 1] == '#' && S[i + 2] == '#') res = "No";
        }
        for(int i = b; i < d - 1; i++) {
            if(S[i + 1] =='#' && S[i + 2] == '#') res = "No";
        }
        if(c > d) {
            boolean flag = false;
            for(int i = b; i <= d; i++) {
                if(S[i-1] == '.' && S[i] == '.' && S[i+1] == '.') {
                    flag = true;
                    break;
                }
            }
            if(!flag) res = "No";
        }

        System.out.println(res);
    }
}
