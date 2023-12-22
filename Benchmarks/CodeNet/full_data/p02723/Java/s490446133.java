import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        char[] chars = S.toCharArray();

        if(chars[2]==chars[3] && chars[4]==chars[5]) {
            System.out.println("Yes");
    } else {
            System.out.println("No");
        }
    }
}