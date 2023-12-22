import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        s = s.replaceAll("dreameraser", "");
        s = s.replaceAll("dreamerase", "");
        s = s.replaceAll("dreamer", "");
        s = s.replaceAll("eraser", "");
        s = s.replaceAll("dream", "");
        s = s.replaceAll("erase", "");
        if (s.length() != 0) System.out.println("NO");
        else System.out.println("YES");

    }
}