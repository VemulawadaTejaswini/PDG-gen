import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                String s = sc.nextLine();
                int t = 0;
                if(s.charAt(0).equals("o")) t++;
                if(s.charAt(1).equals("o")) t++;
                if(s.charAt(2).equals("o")) t++;
                System.out.println(700 + 100 * t);
            }
        }
    }
}