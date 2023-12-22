import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            while (sc.hasNext()) {
                String[] ss = sc.nextLine().split("");
                int t = 0;
                if(ss[0].equals("o")) t++;
                if(ss[1].equals("o")) t++;
                if(ss[2].equals("o")) t++;
                System.out.println(700 + 100 * t);
            }
        }
    }
}