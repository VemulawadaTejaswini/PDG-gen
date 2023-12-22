import java.util.Scanner;

/**
 * Created by Santa on 2016/10/16.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        long[] map = new long[5];

        for (int i = 0; i < N; i++) {
            String s = scanner.next();

            if(s.charAt(0) == 'P')map[0]++;
            if(s.charAt(0) == 'Y')map[1]++;
            if(s.charAt(0) == 'W')map[2]++;
            if(s.charAt(0) == 'G')map[3]++;
        }

        long ans = 0;
        for (int i = 0; i < 4; i++) {
            if(map[i] > 0)ans++;
        }
        if(ans == 3){
            System.out.println("Three");
        }else{
            System.out.println("Four");
        }
    }



}


