import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] c = s.toCharArray();
        char tmp = '#';
        int count = 0;
        for (char slime : c) {
            if (tmp != slime) {
                count++;
                tmp = slime;
            }
        }
        System.out.println(count);
    }
}