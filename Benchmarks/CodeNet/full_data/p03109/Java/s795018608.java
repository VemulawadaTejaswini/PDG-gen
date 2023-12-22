import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String M = S.substring(5,7);
        String D = S.substring(8,10);
        int m = Integer.parseInt(M);
        int d = Integer.parseInt(D);
        if(m>=5) {
            System.out.println("TBD");
        } else {
            System.out.println("Heisei");
        }
    }
}