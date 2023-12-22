import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in) ) {
            String[] line = sc.nextLine().split(" ");
            String[] dList = sc.nextLine().split(" ");

            Arrays.sort(dList);

            long n = Long.valueOf(line[0]);
            long k = Long.valueOf(line[1]);

            long aCnt = n - k;

            if (aCnt <= 0) {
                System.out.println("0");
                return;
            }

            long result = 0;
            for (int i = 0; i < aCnt; i++) {
                result += Long.valueOf(dList[i]);
            }

            System.out.println(result);
        }
    }
}