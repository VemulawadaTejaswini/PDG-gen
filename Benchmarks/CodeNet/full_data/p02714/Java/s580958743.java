
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            int b = scanner.nextInt();
            String s = scanner.next();

            int ans = 0;
            for(int i = 0 ; i < b - 2; ++i){
                for(int j = i+1 ; j < b - 1; ++j){
                    for(int k = j+1; k < b; ++k){
                        if((j - i ) != (k - j)) {
                            if (s.charAt(i) != s.charAt(j) && s.charAt(i) != s.charAt(k) && s.charAt(j) != s.charAt(k)) {
                                ans++;
                            }
                        }
                    }
                }
            }
            System.out.print(ans);
        }
    }


