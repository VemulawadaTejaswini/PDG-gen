import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 入力(s)
        String s = sc.next();

        System.out.println("aiueo".indexOf(s) >= 0 ? "vowel" : "consonant");
        sc.close();
    }
}