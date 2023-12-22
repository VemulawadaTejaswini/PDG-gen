import java.util.*;

class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final String S = sc.next();
        sc.close();
        final String Y[] = {"SAT", "FRI", "THU", "WED", "TUE", "MON", "SUN"};

        for (int i=0; i<7; i++) {
            if (S.equals(Y[i])) {
                System.out.println(i+1);
                return;
            }
        }

    }
}