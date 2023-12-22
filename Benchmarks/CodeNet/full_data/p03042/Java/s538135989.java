import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a1 = Integer.parseInt(s.substring(0, 2));
        int a2 = Integer.parseInt(s.substring(2));
        if(a1 > 0 && a1 < 13 && a2 > 0 && a2 < 13) {
            System.out.println("AMBIGUOUS");
        } else if(a1 > 0 && a1 < 13) {
            System.out.println("MMYY");
        } else if(a2 > 0 && a2 < 13) {
            System.out.println("YYMM");
        } else {
            System.out.println("NA");
        }
    }
}