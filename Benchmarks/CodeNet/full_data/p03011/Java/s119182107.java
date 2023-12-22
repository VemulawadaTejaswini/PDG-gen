import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int P = scanner.nextInt();
        int Q = scanner.nextInt();
        int R = scanner.nextInt();
        scanner.close();

        int min =Integer.MAX_VALUE;

        min = Math.min((P+Q),min);
        min = Math.min((Q+R),min);
        min = Math.min((R+P),min);

        System.out.println(min);

//        System.out.println(System.currentTimeMillis() - startTime);
    }

}
