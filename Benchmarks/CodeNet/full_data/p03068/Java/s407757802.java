import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc =new Scanner(System.in);
        
        int N = sc.nextInt();
        String S = sc.next();
        int K = sc.nextInt();
        String str = S.substring(K-1,K);

        S = S.replaceAll(str, "_");
        S = S.replaceAll("[a-z]","*");
        S = S.replaceAll("_",str);
        
        System.out.println(S);
    }
}
