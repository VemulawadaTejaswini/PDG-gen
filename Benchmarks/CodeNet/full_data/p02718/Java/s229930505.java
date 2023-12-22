import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        ArrayList<Integer> tokuhyou = new ArrayList<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            tokuhyou.add(a);
            sum = sum + a;
        }
        Collections.sort(tokuhyou);
        Collections.reverse(tokuhyou);
        String answer = "Yes";

        for (int j = 0; j < m; j++){
            int ninnki = tokuhyou.get(j);
            if (((double)sum/(4.0*(double) m))> ninnki){
                answer = "No";
                break;
            }
        }
        System.out.println(answer);


    }
}