
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author yoshizaki
 *151
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Deque<String> deque = new ArrayDeque<String>();
        int qcount = scanner.nextInt();
        int submitCount = scanner.nextInt();
        for (int i = 1 ; i <= submitCount ; i++) {
            scanner.nextLine();
            deque.push(scanner.next());
            deque.push(scanner.next());
        }
        int ac = 0;
        int wa = 0;
        String qnum = "";
        String  result = "";
        Map<String,String> submitted = new HashMap<String,String>();
        
        
        while (deque.peek() != null) {
            qnum = deque.pollLast();
            result = deque.pollLast();
            if (!submitted.containsKey(qnum)) {
                submitted.put(qnum, result);
                if (result.equals("AC")) {
                    ac++;
                } else if (result.equals("WA")) {
                    wa++;
                }
            } else if (submitted.get(qnum).equals("WA")) {
                if (result.equals("WA")) {
                    wa++;
                } else if (result.equals("AC")) {
                    submitted.put(qnum, result);
                    ac++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ac).append(" ").append(wa);
        System.out.println(sb.toString());
    }
}