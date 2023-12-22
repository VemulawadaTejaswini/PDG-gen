import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();

        int ans = 0;

        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();

            int valueCount = map.containsKey(value) ? map.get(value) + 1 : 1;
            int valueMinusOneCount = map.containsKey(value - 1) ? map.get(value - 1) + 1 : 1;
            int valuePlusOneCount = map.containsKey(value + 1) ? map.get(value + 1) + 1 : 1;

            map.put(value, valueCount);
            map.put(value - 1, valueMinusOneCount);
            map.put(value + 1, valuePlusOneCount);

            ans = Math.max(Math.max(valueCount, valueMinusOneCount), valuePlusOneCount);
        }
        System.out.println(ans);
    }
}