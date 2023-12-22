
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //コード
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());

        List<Integer> listA = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            listA.add(Integer.parseInt(scanner.next()));
        }


        for(int i = 0; i< listA.size(); i++) {
            ArrayList<Integer> listB = new ArrayList<>(listA);
            listA.remove(i);

            int max = 0;
            for(int j = 0; j < listA.size(); j++) {
               max =  Math.max(max, listA.get(j));
            }

            System.out.println(max);
            listA = new ArrayList<>(listB);
        }

    }
}
