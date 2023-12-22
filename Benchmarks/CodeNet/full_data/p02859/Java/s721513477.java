import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        System.out.println((int) (((Math.PI * Math.pow(r, 2)) / Math.PI) * Math.pow(1, 2)));
        sc.close();
    }
}
