import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static final Map<Integer, String> alpMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        sc.close();

        initMap();

        int val = 0;
        for (int i : alpMap.keySet()) {
            if (alpMap.get(i).equals(c)) {
                val = i;
                break;
            }
        }

        System.out.println(alpMap.get(val + 1));
    }

    private static void initMap() {
        alpMap.put(1, "a");
        alpMap.put(2, "b");
        alpMap.put(3, "c");
        alpMap.put(4, "d");
        alpMap.put(5, "e");
        alpMap.put(6, "f");
        alpMap.put(7, "g");
        alpMap.put(8, "h");
        alpMap.put(9, "i");
        alpMap.put(10, "j");
        alpMap.put(11, "k");
        alpMap.put(12, "l");
        alpMap.put(13, "m");
        alpMap.put(14, "n");
        alpMap.put(15, "o");
        alpMap.put(16, "p");
        alpMap.put(17, "q");
        alpMap.put(18, "r");
        alpMap.put(19, "s");
        alpMap.put(20, "t");
        alpMap.put(21, "u");
        alpMap.put(22, "v");
        alpMap.put(23, "w");
        alpMap.put(24, "x");
        alpMap.put(25, "y");
        alpMap.put(26, "z");
    }

}