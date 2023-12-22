import java.util.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<String, Integer> map = new HashMap<>();
        int max = 0;
        for(int i = 0; i < N; i++) {
            String key = scanner.next();
            if(map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
                max = Math.max(max, map.get(key));
            }else{
                map.put(key, 1);
                max = Math.max(max, 1);
            }
        }

        List<String> listOfCountryNames = new ArrayList<>();
        for (String key : map.keySet()) {
            if(map.get(key) == max) {
                listOfCountryNames.add(key);
            }
        }

        java.util.Collections.sort(listOfCountryNames);

        for (String name : listOfCountryNames) {
            System.out.println(name);
        }

    }
}
