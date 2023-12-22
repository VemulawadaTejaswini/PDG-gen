
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static class Feet implements Comparable<Feet> {
        int leftHands;
        int rightHands;
        int currentFeets;
        int label;
        public Feet() {
            leftHands = 0;
            rightHands = 0;
            currentFeets = 0;
            label = 0;
        }

        public Feet(int leftHands, int rightHands, int currentFeets, int label) {
            this.leftHands = leftHands;
            this.rightHands = rightHands;
            this.currentFeets = currentFeets;
            this.label = label;
        }

        @Override
        public int compareTo(Feet o) {
            long currentNum = leftHands + currentFeets + rightHands;
            long otherNum = o.leftHands + o.currentFeets + o.rightHands;
            if (currentNum > otherNum) {
                return 1;
            } else if (currentNum == otherNum) {
                return 0;
            } else {
                return -1;
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Feet feet = (Feet) o;
            return leftHands == feet.leftHands &&
                    rightHands == feet.rightHands &&
                    currentFeets == feet.currentFeets &&
                    label == feet.label;
        }

        @Override
        public int hashCode() {
            return Objects.hash(leftHands, rightHands, currentFeets, label);
        }
    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        String s = scanner.next();

        int leftOnes = 0;
        int zeros = 0;
        int rightOnes = 0;
        PriorityQueue<Feet> feets = new PriorityQueue<>(Comparator.reverseOrder());
        Map<Integer, Feet> feetMap = new HashMap<>();
        List<Integer> numbers = new ArrayList<>();
        int last = s.charAt(0);
        int count = 1;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) != last) {
                if (last == '1') {
                    numbers.add(count);
                } else {
                    numbers.add(-count);
                }
                count = 1;
                last = s.charAt(i);
            } else {
                ++count;
            }
        }
        if (last == '1') {
            numbers.add(count);
        } else {
            numbers.add(-count);
        }
        int i = 0;
        int ans = 0;

        for (int j = 0; j < numbers.size(); ++j) {
//            System.out.println("numbers: " + numbers.get(j));
            if (numbers.get(j) < 0) {
                int leftHands = j > 0 ? numbers.get(j - 1) : 0;
                int rightHands = j < numbers.size() - 1 ? numbers.get(j + 1) : 0;
                Feet feet = new Feet(leftHands, rightHands, -1 * numbers.get(j), i);
                feetMap.put(i, feet);
                feets.add(feet);
                ++i;
            } else {
                ans = Math.max(ans, numbers.get(j));
            }
        }
        int changes = 0;
        while(true) {
            if (feets.isEmpty()) {
                break;
            }
            Feet feet = feets.poll();
            if (!feetMap.containsKey(feet.label)) {
                continue;
            }
//            System.out.println("feet: " + feet.label + " left: " + feet.leftHands
//            + " right: " + feet.rightHands + " current: " + feet.currentFeets);

            int label = feet.label;
            int currentLen = feet.leftHands + feet.rightHands + feet.currentFeets;
            ans = Math.max(ans, currentLen);

            changes++;
            if (changes == k) {
                break;
            }
            feetMap.remove(feet.label);
            // update left feet
            if (feetMap.containsKey(label - 1)) {
                Feet leftFeet = feetMap.get(label - 1);
                Feet newLeftFeet = new Feet(
                        leftFeet.leftHands,
                        currentLen,
                        leftFeet.currentFeets,
                        label - 1
                );
                feetMap.put(label - 1, newLeftFeet);
                feets.add(newLeftFeet);
            }

            // update right feet
            if (feetMap.containsKey(label + 1)) {
                Feet rightFeet = feetMap.get(label + 1);
                Feet newRightFeet = new Feet(
                        currentLen,
                        rightFeet.rightHands,
                        rightFeet.currentFeets,
                        label + 1
                );
                feetMap.put(label + 1, newRightFeet);
                feets.add(newRightFeet);
            }


        }
        System.out.println(ans);

    }
}
