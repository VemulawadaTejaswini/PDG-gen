import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine().toLowerCase();
        char[] c = s.toCharArray();
        boolean flag = false;
        if (c[2]==c[3]&&c[4]==c[5]){
            System.out.println("YES");
        }else
            System.out.println("NO");
    }
}
