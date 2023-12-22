import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        boolean flgA = false;
        boolean flgB = false;

        if (S.indexOf('A') != -1)
            flgA = true;
        if (S.indexOf('B') != -1)
            flgB = true;

        if (flgA && flgB)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
