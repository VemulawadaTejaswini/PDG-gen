import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        s += in.nextInt();
        s += in.nextInt();
        System.out.println(s>=22?"bust":"win");
    }
}
