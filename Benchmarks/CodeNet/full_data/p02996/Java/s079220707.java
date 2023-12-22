import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<int[]> works = new ArrayList<int[]>();
        int finished = 0;
        boolean[] finish = new boolean[n];
        for (int i = 0; i < n; i++) {
            int[] work = new int[2];
            work[0] = sc.nextInt();
            work[1] = sc.nextInt();
            works.add(work);
            finish[i] = false;
        }
        int currentTime = 0;

        Collections.sort(works, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[1] - b[1];
            }
        });

        for (int i = 0; i < n; i++) {
            int[] work = works.get(i);
            int time = currentTime + work[0];
            if (time > work[1]) {
                System.out.println("No");
                return;
            }
            currentTime = time;
        }
        System.out.println("Yes");
    }
}