import java.util.Scanner;

public class Main {
    private int a, b;
    private int[] towerHeights;

    public Main() {
        Scanner sc = new Scanner(System.in);        
        this.a = Integer.parseInt(sc.next());
        this.b = Integer.parseInt(sc.next()); 
        this.towerHeights = new int[999];
        // set each tower's height
        for (int i = 1; i < 1000; ++i) {
            if (i == 1) {
                towerHeights[0] = 1;
            } else {
                towerHeights[i - 1] = towerHeights[i - 2] + i;
            }
        }
    }

    public void solve() {
        int x = 0;

        int diff = b - a;
        for (int i = 0; i < 999; ++i) {
            if (towerHeights[i + 1] - towerHeights[i] == diff) {
                x = towerHeights[i] - a;
                break;
            } 
        }

        System.out.println(x);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.solve();
    }
}