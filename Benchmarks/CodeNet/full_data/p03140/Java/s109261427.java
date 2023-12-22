import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        int count = 0;
        for (int i = 0 ; i < a.length(); i++) {
            String aa = a.substring(i, i + 1);
            String bb= b.substring(i, i + 1);
            String cc = c.substring(i, i + 1);
            Set<String> strings = new HashSet<>();
            strings.add(aa);
            strings.add(bb);
            strings.add(cc);
            if (strings.size() == 1) {

            } else if (strings.size() == 2) {
                count++;
            } else {
                count += 2;
            }


    }
        System.out.println(count);
}}
