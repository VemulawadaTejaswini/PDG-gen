import java.util.*;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mochiCount = sc.nextInt();
        Set<Integer> mochiSet = new HashSet<>();
        for (int i = 0; i < mochiCount; i++) {
            mochiSet.add(sc.nextInt());
        }
        
        int result = mochiSet.size();
        System.out.println(result);
    }
}
