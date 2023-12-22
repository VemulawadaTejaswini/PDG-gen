import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    List<Long> list = new ArrayList<>();

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int k= sc.nextInt();

        for (int i=1; i<=9; i++) {
            bfs(i);
        }

        Collections.sort(list);

//        System.out.println(list);

        System.out.println(list.get(k-1));


    }

    void bfs(long s) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add(String.valueOf(s));
        list.add(s);
        while (!queue.isEmpty()) {
            String t = ((ArrayDeque<String>) queue).peekFirst();
            if (t.charAt(t.length()-1)=='0') {
                if (t.length()<=9) {
                    queue.add(t+"0");
                    list.add(Long.parseLong(t+"0"));
                }
                if (t.length()<=9) {
                    queue.add(t+"1");
                    list.add(Long.parseLong(t+"1"));
                }
            } else if (t.charAt(t.length()-1)=='1' || t.charAt(t.length()-1)=='2'|| t.charAt(t.length()-1)=='3'|| t.charAt(t.length()-1)=='4'|| t.charAt(t.length()-1)=='5'|| t.charAt(t.length()-1)=='6'|| t.charAt(t.length()-1)=='7'|| t.charAt(t.length()-1)=='8') {
                String tmp = String.valueOf(t.charAt(t.length()-1));
                int num = Integer.parseInt(tmp);
                if (t.length()<=9) {
                    queue.add(t+String.valueOf(num-1));
                    list.add(Long.parseLong(t+String.valueOf(num-1)));
                }
                if (t.length()<=9) {
                    queue.add(t+String.valueOf(num));
                    list.add(Long.parseLong(t+String.valueOf(num)));
                }
                if (t.length()<=9) {
                    queue.add(t+String.valueOf(num+1));
                    list.add(Long.parseLong(t+String.valueOf(num+1)));
                }
            } else if (t.charAt(t.length()-1)=='9') {
                if (t.length()<=9) {
                    queue.add(t+"8");
                    list.add(Long.parseLong(t+"8"));
                }
                if (t.length()<=9) {
                    queue.add(t+"9");
                    list.add(Long.parseLong(t+"9"));
                }
            }
            queue.poll();
        }
    }



}
