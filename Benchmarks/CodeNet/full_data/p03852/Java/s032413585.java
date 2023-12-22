import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        
        String result = "consonant"; 
        if (c.equals("a") || c.equals("i") || c.equals("u") || c.equals("e") || c.equals("o")) result = "vowel";
        
        System.out.println(result);
    }
}
