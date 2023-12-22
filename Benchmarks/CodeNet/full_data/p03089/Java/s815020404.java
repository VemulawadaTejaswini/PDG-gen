import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

class Task {
    LinkedList<Integer> list;
    ArrayDeque<Integer> process;

    Task(LinkedList<Integer> list, ArrayDeque<Integer> process) {
        this.list = list;
        this.process = process;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        LinkedList<Integer> b = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            b.add(sc.nextInt());
        }

        ArrayDeque<Integer> ans = null;
        Stack<Task> stack = new Stack<>();
        stack.add(new Task(b, new ArrayDeque<Integer>()));
        while(!stack.isEmpty()) {
            Task task = stack.pop();
            LinkedList<Integer> tmp = task.list;
            ArrayDeque<Integer> tmpprocess = task.process;

            if(tmp.size() == 0) {
                ans = tmpprocess;
                break;
            }

            for(int i = 0; i < tmp.size(); i++) {
                if(tmp.get(i) == i + 1) {
                    LinkedList<Integer> list = (LinkedList<Integer>)tmp.clone();
                    list.remove(i);
                    ArrayDeque<Integer> process = (ArrayDeque<Integer>)tmpprocess.clone();
                    process.addFirst(i + 1);
                    stack.add(new Task(list, process));
                }
            }
        }

        if(ans == null) {
            System.out.println(-1);
        }else {
            for(int x : ans) {
                System.out.println(x);
            }
        }
 
        sc.close();
    }
}