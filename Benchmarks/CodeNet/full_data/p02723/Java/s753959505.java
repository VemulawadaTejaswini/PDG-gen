import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine().toLowerCase();
        boolean flag = false;
        if (s.charAt(2)==s.charAt(3)&&s.charAt(4)==s.charAt(5)){
            System.out.println("Yes");
        }else
            System.out.println("No");
    }
}
