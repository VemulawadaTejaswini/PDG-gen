import java.io.IOException;
import java.util.Scanner;

/**
 * @author ishihara
 *
 */
public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (A <= C) {
            if (C <= B) {
                System.out.println("yes");
                return;
            }
        }
        System.out.println("no");
    }
}