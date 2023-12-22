import java.math.BigDecimal;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();

        String res = "Yes";
        int count = 0;
        for (char c='a'; c<='z'; c++){
            for (int i=0; i<w.length(); i++){
                if (w.charAt(i) == c){
                    count++;
                }
            }
        }
        if (count%2 == 1){
            res = "No";

        }
        System.out.println(res);
    }
}