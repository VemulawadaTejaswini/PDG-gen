import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); scan.nextLine();

        if (N < 3) {
            System.out.println("0");
            System.exit(0);
        }

        Integer[] march = {0, 0, 0, 0, 0};
        for (int i=0; i<N; i++) {
            switch (scan.next().substring(0,1)) {
                case "M":
                    march[0] += 1;
                    break;
                case "A":
                    march[1] += 1;
                    break;
                case "R":
                    march[2] += 1;
                    break;
                case "C":
                    march[3] += 1;
                    break;
                case "H":
                    march[4] += 1;
                    break;
            }
        }

        int zero = 0;
        for (int i=0; i<5; i++) {
            if (march[i] == 0) zero++;
        }

        if (zero > 3) {
            System.out.println("0");
            System.exit(0);
        } else {
            // march から 0 を削除して、newmarch を生成
            List<Integer> remove = new ArrayList<>(Arrays.asList(0));
            List<Integer> marchlist = new ArrayList<>(Arrays.asList(march));
            marchlist.removeAll(remove);

            int l = marchlist.size();
            int[] newmarch = new int[l];
            Iterator<Integer> iter = marchlist.iterator();
            for (int i=0;i<l;i++) newmarch[i] = iter.next();
            // ここまで

            long ans = 0, anstemp;
            if (zero == 2) {
                System.out.println(newmarch[0] * newmarch[1] * newmarch[2]);
            } else if (zero == 1) {
                for (int unselect = 0; unselect < 4; unselect++) {
                    anstemp = 1;
                    for (int i=0; i<4; i++) {
                        if (i != unselect) anstemp *= newmarch[i];
                    }
                    ans += anstemp;
                }

                System.out.println(ans);
            } else {
                for (int unselect = 0; unselect < 4; unselect++) {
                    for (int unselect2 = unselect+1; unselect2 < 5; unselect2++) {
                        anstemp = 1;
                        for (int i=0; i<5; i++) {
                            if (i != unselect && i != unselect2) anstemp *= newmarch[i];
                        }

                        ans += anstemp;
                    }
                }

                System.out.println(ans);
            }
        }
    }
}
