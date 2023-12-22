import java.util.*;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    static int N;
    static int A;
    static long B;
    static long C;
    static int[] map = new int[1000000];
    static int min = 9994999;




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int ans = 0;
        for (int i = 0; i < N; i++) {
            long temp = scanner.nextInt();

            while(temp > 0){
                if(temp % 2 == 0){
                    temp /= 2;
                    ans++;
                }else{
                    break;
                }
            }
        }

        System.out.println(ans
        );


    }

}

