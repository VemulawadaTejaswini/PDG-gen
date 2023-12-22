import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.substring(0,5) + " " + s.substring(6,6+7) + " " + s.substring(14, 14+5));
    }
}
