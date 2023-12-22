import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numOfPeople = sc.nextInt();
        int numOfFoodTypes = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        int numOfResponses = 0;
        int cnt = 0;

        for (int i = 0; i < numOfPeople; i++) {
            numOfResponses = sc.nextInt();
            for (int j = 0; j < numOfResponses; j++) {
                int A = sc.nextInt();
                map.put(A, map.getOrDefault(A, 0) + 1);
            }
        }

        for (int i = 1; i <= numOfFoodTypes; i++) {
            if (map.containsKey(i) && map.get(i) == numOfPeople) {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}


