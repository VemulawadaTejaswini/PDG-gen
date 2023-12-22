import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        if (s.length() == 2){
            System.out.println(s);
        } else {
            StringBuffer sr = new StringBuffer(s);
            String sred = sr.reverse().toString();
            System.out.println(sred);
        }
    }
}