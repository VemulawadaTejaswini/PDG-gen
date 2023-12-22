import java.util.Scanner;
import java.util.Stack;

class Task {
    int g;
    int solved;
    int used;

    Task(int g, int solved, int used) {
        this.g = g;
        this.solved = solved;
        this.used = used;
    }
}

public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int d = sc.nextInt();
        int g = sc.nextInt() / 100;
 
        int[] p = new int[d];
        int[] c = new int[d];
        for(int i = 0; i < d; i++) {
            p[i] = sc.nextInt();
            c[i] = sc.nextInt() / 100;
        }

        int res = 10000;
        Stack<Task> stack = new Stack<>();
        stack.push(new Task(g, 0, 0));
        while(!stack.isEmpty()) {
            Task t = stack.pop();
            int need = t.g;
            int solved = t.solved;
            int used = t.used;

            for(int i = 0; i < d; i++) {
                if((used / (int) Math.pow(2, i)) % 2 == 1) continue;
     
                if((i + 1) * (p[i] - 1) >= need) {
                    res = Math.min(res, solved + (int) Math.ceil(1.0 * need / (i + 1)));
                }else if ((i + 1) * p[i] + c[i] >= need) {
                    res = Math.min(res, solved + p[i]);
                }else {
                    stack.push(new Task(
                        need - ((i + 1) * p[i] + c[i]), solved + p[i], used + (int) Math.pow(2, i)
                    ));
                }
            }
        }

        System.out.println(res);
 
        sc.close();
    }
}