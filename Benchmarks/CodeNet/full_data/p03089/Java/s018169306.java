import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class Task {
    List<Integer> list;
    Deque<Integer> process;

    Task(List<Integer> list, Deque<Integer> process) {
        this.list = list;
        this.process = process;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        List<Integer> b = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            b.add(sc.nextInt());
        }

        Deque<Integer> ans = null;
        Stack<Task> stack = new Stack<>();
        stack.add(new Task(b, new ArrayDeque<Integer>()));
        loop : while(!stack.isEmpty()) {
            Task task = stack.pop();
            List<Integer> tmp = task.list;
            Deque<Integer> tmpprocess = task.process;

            if(tmp.size() == 0) {
                ans = tmpprocess;
                break;
            }

            for(int i = 0; i < tmp.size(); i++) {
                if(tmp.get(i) == i + 1) {
                    List<Integer> list = new LinkedList<>();
                    for(int j = 0; j < tmp.size(); j++) {
                        int x = tmp.get(j);
                        if(x > j + 1) continue loop;
                        list.add(x);
                    }
                    list.remove(i);
                    Deque<Integer> process = new ArrayDeque<>();
                    for(int x : tmpprocess) {
                        process.addLast(x);
                    }
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