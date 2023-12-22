import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = s.substring(2, 3);
        String s2 = s.substring(3, 4);
        String s3 = s.substring(4, 5);
        String s4 = s.substring(5, 6);
        if(s1.equals(s2) && s3.equals(s4)) System.out.println("Yes");
        else System.out.println("No");
    }
}