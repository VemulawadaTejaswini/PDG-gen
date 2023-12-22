import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int x = 7;
        int a = 0;

        if (S.equals("SUN")) {
            a = 0; 
        }
        else if (S.equals("MON")) {
            a = 1;
        }
        else if (S.equals("TUE")) {
            a = 2;
        }
        else if (S.equals("WED")) {
            a = 3;
        }
        else if (S.equals("THU")) {
            a = 4;
        }
        else if (S.equals("FRI")) {
            a = 5;
        }
        else if (S.equals("SAT")) {
            a = 6;
        }

        System.out.println(x - a);
    }
}