import java.util.*;

public class Main {
    //YYMM or MMYY
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sln(s);
    }

    public static void sln(String s) {
        int first = Integer.parseInt(s.substring(0, 2));
        int second = Integer.parseInt(s.substring(2));
        if ((first > 0 && first < 13) && (second > 0 && second < 13)) System.out.println("AMBIGUOUS");
        else if (first > 0 && first < 13) System.out.println("MMYY");
        else if (second > 0 && second < 13) System.out.println("YYMM");
        else System.out.println("NA");
    }
}