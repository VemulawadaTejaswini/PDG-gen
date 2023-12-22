import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = sc.nextLine();

        boolean found = false;
        int currLen = 2;
        int currIdx;
        HashMap<Character, Integer> map;

        while (currLen < string.length() + 1 && !found) {
            currIdx = 0;
            while (currIdx + currLen - 1 < string.length()) {
                map = new HashMap<>();
                for (int i = 0; i < currLen; i++) {
                    char currChar = string.charAt(i + currIdx);
                    if (map.containsKey(currChar)) {
                        map.replace(currChar, map.get(currChar) + 1);
                    } else {
                        map.put(currChar, 1);
                    }
                }
                boolean unbalance = false;
                for (Integer value: map.values()) {
                    if (value > currLen / 2) {
                        unbalance = true;
                    }
                }
                //System.out.println((currLen));
                if (unbalance) {
                    System.out.print(currIdx + 1 + " " + (currIdx + currLen));
                    System.out.println();
                    found = true;
                }
                currIdx++;
            }
            currLen++;
        }

        if (!found) {
            System.out.println(-1 + " " + -1);
        }
    }
}