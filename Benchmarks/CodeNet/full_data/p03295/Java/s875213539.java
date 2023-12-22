import java.util.List;
import java.util.Scanner;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<blidge> path = new ArrayList<blidge>();
        for (int i = 0; i < m; i++) {
            int s = sc.nextInt() - 1;
            int g = sc.nextInt() - 1;
            path.add((new blidge(s, g)));
        }
        Collections.sort(path);

        boolean conect[] = new boolean[n - 1];
        int ans = 0;
        Arrays.fill(conect, true);
        int pos = -1;
        for (int i = 0; i < m; i++) {
            int left = path.get(i).s;
            int right = path.get(i).g;
            if (pos < left) {
                pos = right - 1;
                conect[pos] = true;
                ans++;
            }

        }
        System.out.println(ans);

        sc.close();
    }
}

class blidge implements Comparable<blidge> {
    int s, g;

    blidge(int s, int g) {
        this.s = s;
        this.g = g;
    }

    @Override
    public int compareTo(blidge other) {
        if (this.g < other.g) {
            return -1;
        } else if (this.g == other.g) {
            return this.s - other.s;
        } else {
            return 1;
        }
    }
}
