import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        String ans = S.substring(0, 5) + " " + S.substring(6, 13) + " " + S.substring(14);

        System.out.println(ans);
    }
}