import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] hArray = new int[N];
        for(int i = 0; i < N; i++){

            hArray[i] = scan.nextInt();
        }

        int ans = 1;
        for(int i = 1; i < N; i++) {


            if (hArray[0] <= hArray[i]) {

                if ((hArray[1] <= hArray[i]) && (hArray[i - 1] <= hArray[i])) {

                    ans++;
                }
            }

        }

        System.out.println(ans);
    }
}