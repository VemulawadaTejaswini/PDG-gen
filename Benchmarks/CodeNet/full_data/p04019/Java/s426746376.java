import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next().trim();
        int s = 0;
        int w = 0;
        int n = 0;
        int e = 0;
        for(int i = 0; i < input.length(); i++) {
            switch (input.charAt(i)) {
                case 'S':
                    s = 1;
                    break;
                case 'N':
                    n = 1;
                    break;
                case 'W':
                    w = 1;
                    break;
                case 'E':
                    e = 1;
                    break;
            }
        }
        String ans = (((s^n)|(e^w)) == 1) ? "No" : "Yes";
        System.out.println(ans);
    }
}
