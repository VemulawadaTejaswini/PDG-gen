import java.util.Scanner;
import java.util.Random;;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String S = scan.next();

        int turnW[] = new int[N]; //Weat西
        int turnE[] = new int[N]; //East東

        for(int i = 0; i < N; i++) {
            if(S.charAt(i) == 'E'){
                turnW[N-1-i] += 1;
            }else if(S.charAt(i) == 'W'){
                turnE[i] += 1;
            }
        }

        for(int i = 1; i < N; i++){
            turnE[i] += turnE[i - 1];
            turnW[i] += turnW[i - 1];
        }

        int min = turnW[N-1];

        for(int i = 1; i < N - 1; i++){
            min = Math.min(min,turnW[N-2-i]+turnE[i-1]);
        }

        min = Math.min(min,turnE[N-1]);

        System.out.println(min);

    }
}
