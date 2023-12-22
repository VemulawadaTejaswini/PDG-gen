import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int count = 0;
        while(S.contains("BW")) {
            S = S.replace("BW", "WB");
            count += 1;
        }
        System.out.println(count);
    }
}
