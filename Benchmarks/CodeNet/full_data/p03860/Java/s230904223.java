import java.util.Scanner;

class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String[] s = in.nextLine().split(" ");
        System.out.println(s[0].charAt(0) + s[1].charAt(0) + s[2].charAt(0));

    }

}