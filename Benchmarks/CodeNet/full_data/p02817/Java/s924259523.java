import java.util.Scanner;

public class RapidProblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first string ");
        String s1 = s.next();
        System.out.println("Enter second string ");
        String s2 = s.next();
        String s3 = s2 + s1;
        System.out.println(s3);
    }
}
