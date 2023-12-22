import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String S = sc.next();
        
        Pattern p = Pattern.compile("^[0-9]{" + A + "}-[0-9]{" + B + "}$");
        Matcher m = p.matcher(S);
        
        System.out.println( (m.find()) ? "Yes" : "No" );
    }
}
