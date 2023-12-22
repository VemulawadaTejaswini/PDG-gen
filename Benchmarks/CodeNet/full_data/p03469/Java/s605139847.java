import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(3, '8');
        str = sb.toString();
        System.out.println(str);
    }
}
