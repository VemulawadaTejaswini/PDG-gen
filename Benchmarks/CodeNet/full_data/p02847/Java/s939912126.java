import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        if (S == "SUN")
            System.out.println("7");
        else if (S == "MON")
            System.out.println("6");
        else if (S == "TUE")
            System.out.println("5");
        else if (S == "WED")
            System.out.println("4");
        else if (S == "THU")
            System.out.println("3");
        else if (S == "FRI")
            System.out.println("2");
        else if (S == "SAT")
            System.out.println("1");
    }
}