import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        StringBuilder a = new StringBuilder();
        for(int i = 0; i < S.length();i++){
            a.append("x");
        }
        System.out.println(a);
    }
}
