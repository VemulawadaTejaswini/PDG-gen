import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int n = scanner.nextInt();
        int result = 0;
        if (d == 0) {
            for (int i = 0; i < n; i++) {
                result += 1;
                if(result%100==0){
                    result += 1;
                }
            }

        } else if (d == 1) {
            for (int i = 0; i < n; i++) {
                result += 100;
                if(result%10000==0){
                    result += 1;
                }
            }
            
        } else if (d == 2) {
            for (int i = 0; i < n; i++) {
                result += 10000;
                if(result%1000000==0){
                    result += 1;
                }
            }


        }
        System.out.println(result);
    }
}