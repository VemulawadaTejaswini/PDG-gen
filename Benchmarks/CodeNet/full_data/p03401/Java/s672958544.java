import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] spots = new Integer[n];
        for (int i = 0; i < n; i++) {
            spots[i] = scanner.nextInt();
        }
        List<Integer> spotsList = Arrays.asList(spots);


        int originMax = max(spotsList);
        int originMin = min(spotsList);
        int result = 0;
        int max = originMax;
        int min = originMin;
        for (int i = 0; i < n; i++) {
            result = 0;
            max = originMax;
            min = originMin;

            List<Integer> subList = new ArrayList<>(spotsList);
            if (subList.get(i) == max) {
                subList.remove(i);
                max = max(subList);
            } else if (subList.get(i) == min) {
                subList.remove(i);
                min = min(subList);
            }
            result += 2 * max + 2 * Math.abs(min);
            System.out.println(result);
        }


    }

    private static int max(List<Integer> list) {
        Optional<Integer> max = list.stream()
                .filter(spot -> spot >= 0)
                .max((o1, o2) -> o1 - o2);
        return max.orElse(0);
    }

    private static int min(List<Integer> list) {
        Optional<Integer> min = list.stream()
                .filter(spot -> spot <= 0)
                .max((o1, o2) -> o2 - o1);
        return min.orElse(0);
    }


}
