import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String ans = s;
        int left = 0;
        int right = 0;

        int c = 0;

        if (s.charAt(0) == '(') {
            left++;
        } else {
            right++;
        }

        while( ++c < s.length() ) {
            if(s.charAt(c) == '(') {
                if(right > 0) {
                    for(int i=0; i<right; i++) {
                        ans = '(' + ans;
                    }
                    right = 0;
                    left = 1;
                } else {
                    left++;
                }
            } else {
                if(left > 0) {
                    left--;
                } else {
                    right++;
                }
            }
        }

        for(int i=0; i<left; i++) {
            ans = ans + ')';
        }

        for(int i=0; i<right; i++) {
            ans = '(' + ans;
        }

        System.out.println(ans);
    }
}