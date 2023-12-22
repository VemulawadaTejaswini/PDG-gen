import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] sn = sc.nextLine().split(" ");

        String S = sn[0];
        String T = sn[1];
        System.out.println(T + S);
    }
}
