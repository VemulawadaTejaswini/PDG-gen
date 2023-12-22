import java.util.*;

class Main {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {

    private int getDiff(int time) {
        return (10 - time % 10) % 10;
    }

    private int getNextOrderTime(int time) {
        return time + getDiff(time);
    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        List<Integer> A = new LinkedList<Integer>();
        A.add(sc.nextInt());
        A.add(sc.nextInt());
        A.add(sc.nextInt());
        A.add(sc.nextInt());
        A.add(sc.nextInt());

        int idx = 0;
        int max = 0;
        for (int i = 0; i < 5; i++) {
            int diff = getDiff(A.get(i));
            if (max < diff) {
                max = diff;
                idx = i;
            }
        }

        int time = 0;
        for (int i = 0; i < 5; i++) {
            if (i == idx) {
                time += A.get(i);
            } else {
                time += getNextOrderTime(A.get(i));
            }
        }
        System.out.println(time);

        return;
    }

}