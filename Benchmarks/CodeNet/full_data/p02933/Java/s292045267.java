import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String first = scan.next();
        String second = scan.next();
        String result = "";
        
        if (Integer.parseInt(first) >= 3200) {
            result = second;
        } else {
            result = "red";
        }
        System.out.println(result);
    }
}