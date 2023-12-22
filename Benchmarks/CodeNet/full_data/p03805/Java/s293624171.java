import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[2 * m][2];
        for(int i = 0;i < m;i++) {
            a[i][0] = sc.nextInt() - 1;
            a[2 * m - 1 - i][1] = a[i][0];
            a[i][1] = sc.nextInt() - 1;
            a[2 * m - 1 - i][0] = a[i][1];
        }

        System.out.println(dfs(n, m, a, new boolean[n], 0, 0));
    }

    private static int dfs(int n, int m, int[][] a, boolean[] footprints, int here, int count) {
        if(footprints[here]) return 0;

        footprints[here] = true;
        boolean hasConquered = true;
        for(int i = 0;i < footprints.length;i++) {
            if(!footprints[i]) {
                hasConquered = false;
                break;
            }
        }
        if(hasConquered) return 1;

        int tmpCount = count;
        for(int i = 0;i < 2 * m;i++) {
            if(a[i][0] == here && !footprints[a[i][1]]) {
                tmpCount += dfs(n, m, a, footprints, a[i][1], count);
                footprints[a[i][1]] = false;
            }
        }

        return tmpCount;
    }

}
