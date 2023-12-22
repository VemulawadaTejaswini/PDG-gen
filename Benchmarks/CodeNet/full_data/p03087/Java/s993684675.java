import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int nbQuestion = sc.nextInt();
        String originalString = sc.next();

        for (int i=0; i<nbQuestion; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();

            String substring = originalString.substring(start-1, end);

            int sum = 0;

            for (int j=0; j<substring.length()-1; j++) {
                String subSubString = substring.substring(j, j+2);
                if (subSubString.equals("AC")) {
                    sum += 1;
                }
            }

            System.out.println(sum);
        }
    }
}
