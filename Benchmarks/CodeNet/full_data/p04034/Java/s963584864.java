import java.util.*;

public class Main {
    private class Box {
        int bolls;
        boolean isRed;

        public Box() {
            bolls = 1;
            isRed = false;
        }

        public void add(Box src) {
            this.isRed |= src.isRed;
            this.bolls += 1;

            src.bolls -= 1;
            if (src.bolls == 0) {
                src.isRed = false;
            }
        }
    }

    public void main(Scanner sc) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        Box boxs[] = new Box[n];
        for (int i = 0; i < n; i++) {
            boxs[i] = new Box();
        }

        boxs[0].isRed = true;
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            boxs[y - 1].add(boxs[x - 1]);
        }

        System.out.println(Arrays.stream(boxs).mapToInt(box -> box.isRed ? 1 : 0).sum());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new Main().main(sc);
        sc.close();
    }
}
