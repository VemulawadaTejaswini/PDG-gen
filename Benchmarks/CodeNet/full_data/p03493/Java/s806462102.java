import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int counter = 0;
        for (int i=0; i<3; i++) {
            if (s.charAt(i) == '1') counter++;
        }
        System.out.println(counter);
    }
}
