import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
     
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
 
        int N = sc.nextInt();
 
        String line;
        String[] sline = new String[10];
        String key = "";
        int value;

        Map<String, Integer> map = new HashMap<>();

        line = sc.nextLine();

        for (int i = 0; i < N; i++) {
            line = sc.nextLine();

            sline = line.split("");
            Arrays.sort(sline);
            key = String.join("", sline);

            if (map.containsKey(key)) {
                if (map.get(key) == 1) {
                    value = map.get(key) + 2;
                } else {
                    value = map.get(key) + 1;
                }
            } else {
                value = 0;
            }
            map.put(key, value);
        }

        Collection clct = map.values();
        ArrayList array = new ArrayList();
        array.addAll(clct);
        Collections.sort(array,Comparator.reverseOrder());
 
        int i = 0;
        long count = 0;
        while ((int) (array.get(i)) != 0) {
            count += (int) array.get(i);
            if (i + 1 == array.size()) {
                break;
            }
            i++;
        }
        System.out.println(count);
    }
}