import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
        for (Integer i=1; i<=n; i++) {            
            a.put(i, sc.nextInt());
        }
        
        Integer next = 1;
        Integer count = 0;
        while (true) {
            next = a.get(next);
            count++;
            if (next == 1) {
                System.out.println("-1");
                return;
            }
            if (next == 2) {
                System.out.println(count);
                return;
            }
        }
    }
}