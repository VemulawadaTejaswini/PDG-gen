import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = in.nextInt();
        String str = in.next();
        int min = n;
        for (int i = 0; i < n; i++){
            int temp = 0;
            for (int j = 0; j < i; j++){
                if (str.charAt(j) == 'W') temp++;
            }
            for (int j = i+1; j < n; j++){
                if (str.charAt(j) == 'E') temp++;
            }
            min = Math.min(min, temp);
        }
        System.out.println(min);
    }

}