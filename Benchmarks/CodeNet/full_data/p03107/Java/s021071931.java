import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] c = s.toCharArray();
        int zero = 0;
        int one = 0;
        for (int i = 0; i < s.length(); i++) {
            if(c[i] == '0') {
                zero++;
            }else{ 
                one++;
            }
        }
        int ans = Math.min(zero, one) * 2;
        System.out.println(ans);
    }
}
