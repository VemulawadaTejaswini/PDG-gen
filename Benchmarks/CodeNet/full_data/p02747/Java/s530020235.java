import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {
        String s = sc.next();

        Pattern p = Pattern.compile("hi");
        Matcher m = p.matcher(s);
        if(m.find()){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}