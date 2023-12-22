import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //System.setIn(Main.class.getClassLoader().getResourceAsStream("input"));
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n = sc.nextInt();
        sc.nextLine();
        String slim  = sc.nextLine();
        int res = 1;
        for (int i = 1; i < n; i++) {
            if(slim.charAt(i) != slim.charAt(i-1)) res++;
        }
        System.out.println(res);
    }
}
