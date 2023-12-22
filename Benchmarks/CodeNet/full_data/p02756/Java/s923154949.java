import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        StringBuilder before = new StringBuilder();
        StringBuilder after = new StringBuilder();
        String start = scanner.nextLine();
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
                String[] q = s.split(" ");
                if(!reverse) {
                    if(q[1].equals("1")) before.append(q[2]);
                    if(q[1].equals("2")) after.append(q[2]);
                } else {
                    if(q[1].equals("1")) after.append(q[2]);
                    if(q[1].equals("2")) before.append(q[2]);
                }
            }
        }
        before.reverse();
        before.append(start);
        before.append(after.toString());
        if(reverse) before.reverse();
        System.out.println(before.toString());
    }
}
