
import java.util.*;

// "static void main" must be defined in a public class.
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        int Q = Integer.valueOf(sc.nextLine());
        boolean reverse = false;
        StringBuilder sb = new StringBuilder(S);
        for (int i = 0; i < Q; i++) {
            String input = sc.nextLine();
            String[] as = input.split(" ");
            if(as[0].equals("1")) {
                reverse ^= true;
            } else if(as[1].equals("1") && !reverse || as[1].equals("2") && reverse) {
                sb.insert(0, as[2]);
            } else {
                sb.append(as[2]);
            }
        }
        if(reverse){
            sb.reverse();
        }
        System.out.println(sb.toString());
    }
}
