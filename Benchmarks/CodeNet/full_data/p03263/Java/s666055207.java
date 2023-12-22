import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int[][] a = new int[H][W];
        for (int i=0;i<H;i++) {
            for (int j=0;j<W;j++) {
                a[i][j] = Integer.parseInt(sc.next());
            }
        }
        ArrayList<Integer> y_b = new ArrayList<Integer>();
        ArrayList<Integer> x_b = new ArrayList<Integer>();
        ArrayList<Integer> y_a = new ArrayList<Integer>();
        ArrayList<Integer> x_a = new ArrayList<Integer>();
        int cnt = 0;
        for (int i=0;i<H;i++) {
            for (int j=0;j<W;j++) {
                if (i==H-1 && j==W-1) {
                    continue;
                }
                if (a[i][j]%2==1 && j==W-1) {
                    y_b.add(i);
                    x_b.add(j);
                    y_a.add(i+1);
                    a[i+1][j]++;
                    x_a.add(j);
                    cnt++;
                } else if (a[i][j]%2==1) {
                    y_b.add(i);
                    x_b.add(j);
                    y_a.add(i);
                    x_a.add(j+1);
                    a[i][j+1]++;
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
        for (int i=0;i<cnt;i++) {
            System.out.println((y_b.get(i)+1) + " " + (x_b.get(i)+1) + " " + (y_a.get(i)+1) + " " + (x_a.get(i)+1));
        }
        // System.out.println(Arrays.deepToString(a));
    }
}