import javax.swing.text.Style;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
        }

        int ans = 0;

        for(int i = 0; i < n; i++){
            int[] subArray = Arrays.copyOfRange(p, 0, i+1);
            if(p[i]== Arrays.stream(subArray).min().getAsInt()){
                ans++;
            }
        }

        System.out.println(ans);
    }
}