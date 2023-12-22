import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String ans = "";

        int f = Integer.parseInt(s.substring(0, 2));
        int l = Integer.parseInt(s.substring(2, 4));

        //System.out.println(f);
        //System.out.println(l);


        if (f < 1 || 12 < f) {
            if (l < 1 || 12 < l) {
                ans = "NA";
            } else {
                ans = "YYMM";
            }
        } else {
            if (l < 1 || 12 < l) {
                ans = "MMYY";
            } else {
                ans = "AMBIGUOUS";
            }
        }
        System.out.println(ans);
    }
}
