import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String s1 = scan.next();
        String s2 = scan.next();
        String s3 = scan.next();
        StringBuilder sb = new StringBuilder();
        sb.append(s1.toCharArray()[0]);
        sb.append(s2.toCharArray()[0]);
        sb.append(s3.toCharArray()[0]);
        System.out.println(sb.toString());
    }
}
