import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input_text = scanner.nextLine();
        int N = Integer.parseInt(input_text);
        HashMap<String, Integer> map = new HashMap<>();
        int maximum = 0;
        for(int i = 0; i < N; i++) {
            input_text = scanner.nextLine();
            if(!map.containsKey(input_text)) map.put(input_text, 0);
            int val = map.get(input_text) + 1;
            if (maximum < val) {
                maximum = val;
            }
            map.put(input_text, val);
        }

        List<String> array = new ArrayList<>();
        for(String key : map.keySet()) {
            if(map.get(key) >= maximum) {
                array.add(key);
            }
        }
        
        Collections.sort(array);
        for(String d : array) {
            System.out.println(d);
        }
        scanner.close();
    }

}