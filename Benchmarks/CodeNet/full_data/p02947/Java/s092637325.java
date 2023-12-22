import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String countStr = scanner.nextLine();
        int count = Integer.parseInt(countStr);

        List<Set<Character>> charsList = new ArrayList<>();
        for (int i=0; i<count; i++) {
            String line = scanner.nextLine();
            Set<Character> charSet = new HashSet<>();
            for (int j=0; j<line.length(); j++) {
                charSet.add(line.charAt(j));
            }
            charsList.add(charSet);
        }
        long result = 0;
        AnagramCounter counter = new AnagramCounter();
        for (int i=0; i<count-1; i++) {
            if (counter.contains(i)) {
                continue;
            }
            for (int j=i+1; j<count; j++) {
                if (counter.contains(j)) {
                    continue;
                }
                Set<Character> setI = charsList.get(i);
                Set<Character> setJ = charsList.get(j);
                if (setI.equals(setJ)) {
                    counter.addPair(i, j);
                }
            }
        }

        System.out.println(counter.getResult());
    }

}

class AnagramCounter {

    private Map<Integer, Set<Integer>> anagramMap = new HashMap<>();

    private Set<Integer> anagramSet = new HashSet<>();

    public void addPair(int i, int j) {
        anagramSet.add(i);
        anagramSet.add(j);

        Set<Integer> aSet = anagramMap.get(i);
        if (aSet == null) {
            aSet = new HashSet<>();
            anagramMap.put(i, aSet);
        }
        aSet.add(j);
    }

    public boolean contains(Integer i) {
        return anagramSet.contains(i);
    }

    public long getResult() {
        long keyCount = anagramMap.keySet().size();
        long valueCount = 0;
        for (Integer key : anagramMap.keySet()) {
            long anagramCount = anagramMap.get(key).size() + 1;
            long pairCountForKey = anagramCount * (anagramCount-1) / 2;
            valueCount += pairCountForKey;
        }

        return valueCount;
    }
}
