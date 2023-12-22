import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int l = S.length();
        int minval = 1000;
        for(int i=0; i+3<=l; i++) {
            String sub = S.substring(i, i+3);
            Integer val = Integer.parseInt(sub);
            Integer tmp = Math.abs(val - 753);
            if(tmp < minval) minval=tmp;
//            System.out.println(sub);
        }
        System.out.println(minval);
    }
}
