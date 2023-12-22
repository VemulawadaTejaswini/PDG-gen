import java.util.Scanner;
import java.util.Random;;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int Q = scan.nextInt();
        String S = scan.next();

        for(int i = 0; i < Q; i++){
            int l = scan.nextInt();
            int r = scan.nextInt();
            int ans = 0;
            for(int j = l-1; j < r-1; j++){
                if(S.charAt(j) == 'A' && S.charAt(j + 1) == 'C'){
                    ans += 1;
                }
            }
            System.out.println(ans);
        }
    }
}
