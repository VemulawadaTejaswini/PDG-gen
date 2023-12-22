import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        String result = "";
        for (int i=0; i<N; i++) {
            final int[] txy = {sc.nextInt(),sc.nextInt(),sc.nextInt()};
            result = judgeValidMove(txy);
            if(result == "No") {
                break;
            }
        }

        if(result == "Yes") {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }

    public static String judgeValidMove(int[] txy){
        if(txy[0] < txy[1] + txy[2]){
            return "No";
        }
        if(txy[0]%2 == 1 && (txy[1] + txy[2])%2 == 1){
            return "Yes";
        } else if (txy[0]%2 == 0 && (txy[1] + txy[2])%2 == 0){
            return "Yes";
        } else {
            return "No";
        }
    }
}