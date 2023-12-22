import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static String solution(int n){
        int last = n% 10;
        n /=10;
        while(n > 0){
            int j = n % 10;
            if (j == last) return "Bad";
            else last = j;
            n/=10;
        }
        return "Good";
    }

    public static void main(String[] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        System.out.println(solution(n));

    }
}