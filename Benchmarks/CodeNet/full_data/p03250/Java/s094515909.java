import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
      
        List<Integer> list = new ArrayList<>();
        while (sc.hasNext()) {
            list.add(sc.nextInt());
        }

        Collections.sort(list);
        String max = String.valueOf(list.get(2)) + String.valueOf(list.get(1));
        int result = Integer.parseInt(max) + list.get(0);
      
        System.out.println(result);
    }
}
