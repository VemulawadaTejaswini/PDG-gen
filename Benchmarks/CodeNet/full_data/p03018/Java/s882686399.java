import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        s = s.replace("BC", "D");
        int counter = 0;
        int a_counter = 0;

        if (s.length() < 2) {
            counter = 0;
        } else {
            for(int i = 0; i<s.length();i++) { // O(N)
                if (s.charAt(i) == 'A') {
                    a_counter++;
                } else if (s.charAt(i) == 'D') {
                    counter += a_counter;
                } else {
                    a_counter = 0;
                }
            }
        }
        // 出力
        System.out.println(counter);
    }

}
