import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> maxs = new ArrayList<>();
        int num = Integer.parseInt(in.nextLine());
        maxs.add(Integer.parseInt(in.nextLine()));
        hoge: for (int i = 0; i < num - 1; i++) {
            int a = Integer.parseInt(in.nextLine());
            if (maxs.get(maxs.size() - 1) >= a) {
                maxs.add(a);
            } else {
                if (!maxs.contains(a)) {
                    if (maxs.get(0) < a) {
                        maxs.set(0, a);
                    } else {
                        int max = 0;
                        int min = maxs.size() - 1;
                        while (max - min != 1) {
                            int cen = (max - min) / 2;
                            if (maxs.get(cen) < a) {
                                min = cen;
                            } else {
                                max = cen;
                            }
                        }
                        maxs.set(min, a);
                    }
                } else {
                    maxs.set(maxs.lastIndexOf(a) + 1, a);
                }
            }

        }
        System.out.println(maxs.size());
    }
}
