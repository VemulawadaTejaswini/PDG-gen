import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(execute(sc.nextLine()));

    }

    public static String execute(String str) {
        String top = str.substring(0,1);
        String last = str.substring(str.length() - 1);
        int length = str.length() - 2;

        return top + length + last;
    }
}
