import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int size = str.length() - 2;
        System.out.println(str.substring(0, (str.length() > 3 ? 2 : 1)) + size + str.substring(str.length() - 1));
    }
}