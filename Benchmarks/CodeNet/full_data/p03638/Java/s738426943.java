
import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();

        int[][] ans = new int[h][w];

        List<Integer> list = new ArrayList<>();

        for (int i=0; i<n; i++) {
            for (int j=0; j<arr[i]; j++) {
                list.add(i+1);
            }
        }

//        System.out.println(list);

        List<List<Integer>> sub = new ArrayList<>();

        for (int i=0; i<h; i++) {
            sub.add(list.subList(i*w, i*w+w));
        }

//        System.out.println(sub);

        for (int i=0; i<h; i++) {
            if (i%2==0) {
                for (int j=0; j<w-1; j++) {
                    System.out.print(sub.get(i).get(j)+" ");
                }
                System.out.println(sub.get(i).get(w-1));
            } else {
                for (int j=w-1; j>=1; j--) {
                    System.out.print(sub.get(i).get(j)+" ");
                }
                System.out.println(sub.get(i).get(0));

            }
        }




    }

}