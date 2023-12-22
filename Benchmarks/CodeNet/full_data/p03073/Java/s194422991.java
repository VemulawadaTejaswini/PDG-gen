import java.util.*;

public class Main {
    static public void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int odd0 = 0, odd1 = 0, even0 = 0, even1 = 0;

        for (int i = 0; i < s.length(); i++) {

            if(i % 2 == 0) {
                if (s.charAt(i) == '0') {
                    odd0++;
                } else {
                    odd1++;
                }
            } else {
                if (s.charAt(i) == '0') {
                    even0++;
                } else {
                    even1++;
                }
            }
        }

        System.out.println(Math.min(odd0 + even1, odd1 + even0));

    }
}