
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String s = sc.next();

        int r=0,b=0;
        String ans;

        for(int i = 0; i<s.length(); i++) {
            switch (s.charAt(i)) {
                case 'R':
                    r++;
                    break;
                case 'B':
                    b++;
                    break;
            }
        }
        if (r > b) {
            ans = "Yes";
        } else {
            ans = "No";
        }

        System.out.println(ans);

    }
}