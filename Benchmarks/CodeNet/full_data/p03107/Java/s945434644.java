import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        while(true){
            String s2 = s.replace("01","");
            String s3 = s2.replace("10","");
            if(s.equals(s3)) break;
            ans += s.length() - s3.length();
            s = s3;
        }
        System.out.println(ans);
    }
}
