import java.util.Scanner;

/**
 * Created by sonetsuyoshi on 2016/07/31.
 */
public class Main {

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().split(" ")[1];

        System.out.println("A" + s.charAt(0) + "C");
    }
}