import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        if(s.substring(0,Math.min(s.length(),4)).equals("YAKI")){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}