import java.util.Scanner;

/**
 * Created by shaoq on 2016/10/23.
 */
public class Main {
    public static String getCF(String s) {
        s = s.replace("Q","");
        s = s.replace("A","");
        s = s.replace("Z","");
        s = s.replace("W","");
        s = s.replace("S","");
        s = s.replace("X","");
        s = s.replace("E","");
        s = s.replace("D","");
        s = s.replace("R","");
        s = s.replace("V","");
        s = s.replace("T","");
        s = s.replace("G","");
        s = s.replace("B","");
        s = s.replace("Y","");
        s = s.replace("H","");
        s = s.replace("N","");
        s = s.replace("U","");
        s = s.replace("J","");
        s = s.replace("M","");
        s = s.replace("I","");
        s = s.replace("K","");
        s = s.replace("O","");
        s = s.replace("L","");
        s = s.replace("P","");
        if (s.contains("CF")) {
            return "Yes";
        } else {
            return "No";
        }
    }
    
    public static void main(String ... args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(getCF(s));
    }
}
