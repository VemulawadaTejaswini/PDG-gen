import java.util.*;

class Main{
    public static void main(String[] args[]) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int c = 0;

        for (int i=0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                c++;
            }
        }
        System.out.print(c);
    }
}