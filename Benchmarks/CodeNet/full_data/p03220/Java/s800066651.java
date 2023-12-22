import java.util.*;
import java.lang.Math.*;
 
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temperature = sc.nextInt();
        int average = sc.nextInt();
        List<Integer> resultList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            resultList.add((int)Math.abs(average - sc.nextInt() * 0.006));
        }
        Collections.sort(resultList);
        System.out.println(resultList.get(0));
    }
}