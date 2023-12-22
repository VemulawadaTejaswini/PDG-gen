import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] sp = S.split("");
        Deque<String> deque = new ArrayDeque<>();
        for(String s : sp) {
            if(s.equals("0") || s.equals("1")) deque.push(s);
            else {
                if(deque.size() != 0) deque.pop();
            }
        }
        for(String a : deque) {
            System.out.print(a);
        }
        System.out.println();
    }
    
}