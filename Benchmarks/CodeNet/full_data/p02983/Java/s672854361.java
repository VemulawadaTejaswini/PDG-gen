import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        Set<Integer> seti = new HashSet<>();
        Set<Integer> setj = new HashSet<>();
        int min = (l * r) % 2019;
        for (int i = l; i < r; i++) {
            if (seti.size() == 2019) {
                break;
            }
            if (!seti.contains(i % 2019)) {
                for (int j = i + 1; j <= r; j++) {
                    if (setj.size() == 2019) {
                        break;
                    }
                    if (!setj.contains(j % 2019)) {
                        min = Math.min(min, (i * j) % 2019);
                        setj.add(j % 2019);
                    }
                }
                setj.clear();
                seti.add(i % 2019);
            }
        }
        System.out.println(min);
        sc.close();
    }
}