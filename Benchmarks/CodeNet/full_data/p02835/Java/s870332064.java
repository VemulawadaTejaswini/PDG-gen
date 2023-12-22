import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = Integer.parseInt(scan.next());
        int second = Integer.parseInt(scan.next());
        int third = Integer.parseInt(scan.next());

        //long input = scan.nextLong();
//        String first = scan.next();
//        String second = scan.next();
        //for (int i = 1; i <=input; i++) {
        //}
        if(first+second+third >= 22) {
            System.out.println("bust");
        } else {
            System.out.println("win");
        }
    }
}
