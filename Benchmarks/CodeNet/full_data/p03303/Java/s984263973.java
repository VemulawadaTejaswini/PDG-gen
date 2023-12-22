import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] c = scanner.next().toCharArray();
        int k = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0;i < c.length;i += k){
            sb.append(c[i]);
        }
        System.out.println(sb.toString());
    }
}
