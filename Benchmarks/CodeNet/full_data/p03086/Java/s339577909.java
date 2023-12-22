
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String S = scanner.nextLine();

        int ret = 0;
        int count = 0;
        for (char c : S.toCharArray()) {
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                count++;
            } else {
                if (ret < count) {
                    ret = count;
                }
                count = 0;
            }
        }

        if (ret < count) {
            ret = count;
        }
        System.out.println(ret);
    }

}
