
import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        sb.append(scanner.next());
        int query = scanner.nextInt();
        scanner.nextLine();
        String[] querys = new String[query];
        boolean reverse = false;
        for(int i = 0; i < query; i++) {
            querys[i] = scanner.nextLine();
        }
        for(String s : querys) {
            if(s.equals("1")) {
                reverse = !reverse;
            } else {
                sb = doQuery(sb, s, reverse);
            }
        }
        if(reverse) sb.reverse();
        System.out.println(sb.toString());
    }
    public static StringBuilder doQuery(StringBuilder sb, String query, boolean reverse) {
        String[] q = query.split(" ");
        if(!reverse) {
            if(q[1].equals("1")) sb.insert(0, q[2]);
            if(q[1].equals("2")) sb.append(q[2]);
            return sb;
        } else {
            if(q[1].equals("2")) sb.insert(0, q[2]);
            if(q[1].equals("1")) sb.append(q[2]);
            return sb;
        }
    }
}
