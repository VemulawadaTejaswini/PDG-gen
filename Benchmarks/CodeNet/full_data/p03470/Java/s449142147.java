import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> mochiSet = new HashSet<>();
        for (int i = 0; i < sc.nextInt(); i++) {
            mochiSet.add(sc.nextInt());
        }
        System.out.println(mochiSet.size());
    }
}
