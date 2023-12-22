
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();

        String[] c = new String[n];

        for (int i = 0; i < n; i++) {
                c[i] = str.substring(i, i + 1);
        }

        long min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if(i == j){
                    continue;
                }

                if(i < j){
                    if(Objects.equals(c[j], "E")) count++;
                }else{
                    if(Objects.equals(c[j], "W")) count++;
                }
            }
            if(count < min){
                min = count;
            }
        }

        System.out.println(min);
    }
}
