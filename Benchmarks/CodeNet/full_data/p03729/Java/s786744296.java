import com.sun.applet2.AppletParameters;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();
        String s3 = scanner.next();
        if(s1.charAt(s1.length() - 1) == s2.charAt(0) && s2.charAt(s2.length() - 1) == s3.charAt(0)){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }

}

