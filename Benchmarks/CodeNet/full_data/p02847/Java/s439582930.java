import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String today = sc.next();
        ArrayList l = new ArrayList(7);
        l.add("SAT");
        l.add("FRI");
        l.add("THU");
        l.add("WED");
        l.add("TUE");
        l.add("MON");
        l.add("SUN");
        System.out.println(l.indexOf(today)+1);
    }
}