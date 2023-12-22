import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        Map<Character,Integer> countMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            countMap.put(c, countMap.containsKey(c) ? countMap.get(c)+1 : 1);
        }

        int unyieldingIJ = 0;
        int count;
        for (Entry<Character,Integer> e : countMap.entrySet()) {
            count = e.getValue();
            if (count > 1) {
                unyieldingIJ += count * (count - 1) / 2 - 1; 
            }
        }
        int totalIJ = str.length() * (str.length() - 1) / 2;
        System.out.println(totalIJ-unyieldingIJ);
    }
}