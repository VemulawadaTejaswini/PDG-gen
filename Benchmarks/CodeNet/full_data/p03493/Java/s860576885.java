import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        String a = sc.next();
        for (int i = 0; i < a.length(); i++) {
            char chara = a.charAt(i);
            if (chara == '1') {
                count++;
            }

        }

        System.out.println(count);
        sc.close();
    }
}