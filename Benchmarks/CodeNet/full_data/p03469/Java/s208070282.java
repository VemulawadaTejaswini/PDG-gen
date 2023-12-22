import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        String regex = "2017";
        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(S);
        String result = m.replaceFirst("2018");

        System.out.println(result);

        in.close();
    }
}
