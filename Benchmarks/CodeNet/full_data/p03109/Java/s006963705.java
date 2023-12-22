import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
public class A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String date = scan.next();
        System.out.println(date.compareTo("2019/04/30")<= 0 ? "Heisei" : "TBD");
    }
}