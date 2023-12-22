import java.util.*;
public class Main{
public static void main(String gg[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int counter = 0;
        int i = 0;
        while (i < n-2) {
            if (s.charAt(i) == 'A' && s.charAt(i + 1) == 'B' && s.charAt(i + 2) == 'C') {
                counter++;
                i++;
            } else {
                i++;
            }
        }
        System.out.println(counter);
    }
}