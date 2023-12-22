import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static String solution(String n){
        for (int i = 1; i < 4; i++){
            if (n.charAt(i) == n.charAt(i-1)) return "Bad";
        }
        return "Good";
    }

    public static void main(String[] args){
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String n = in.next();
        System.out.println(solution(n));

    }
}