import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ar = {"SUN","MON", "TUE", "WED", "THU", "FRI", "SAT"};
        String s = sc.next();
        for (int i = 0; i < ar.length; i++) {
            if (s.equals(ar[i])) {
                System.out.println(7 - i);
                return;
            }
        }
        
    }
}