

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static class Elem {
        int value;
        int pos;
        int number;

        public Elem(int value, int pos, int number) {
            this.value = value;
            this.pos = pos;
            this.number = number;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Elem elem = (Elem) o;
            return value == elem.value &&
                    pos == elem.pos &&
                    number == elem.number;
        }

        @Override
        public int hashCode() {
            return Objects.hash(value, pos, number);
        }

        @Override
        public String toString() {
            return "Elem{" +
                    "value=" + value +
                    ", pos=" + pos +
                    ", number=" + number +
                    '}';
        }
    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        String s = scanner.next();
        String[] t = new String[q];
        String[] d = new String[q];
        for (int i = 0; i < q; ++i) {
            t[i] = scanner.next();
            d[i] = scanner.next();
        }
        Map<Integer, Set<Elem>> lefts = new HashMap<>();
        Map<Integer, Set<Elem>> rights = new HashMap<>();

        for (int i = 0; i < s.length(); ++i) {
            int current = s.charAt(i) - 'A';
            if (i - 1 >= 0) {
                int left = s.charAt( i -1) - 'A';
                Set<Elem> elems = lefts.getOrDefault(current, new HashSet<>());
                elems.add(new Elem(left, i - 1, 1));
                lefts.put(current, elems);
            } else {
                Set<Elem> elems = lefts.getOrDefault(current, new HashSet<>());
                elems.add(new Elem(26, i - 1, 1));
                lefts.put(current, elems);
            }
            if (i  + 1 < s.length()) {
                int right = s.charAt( i +1) - 'A';
                Set<Elem> elems = rights.getOrDefault(current, new HashSet<>());
                elems.add(new Elem(right, i + 1, 1));
                rights.put(current, elems);
            } else {
                Set<Elem> elems = rights.getOrDefault(current, new HashSet<>());
                elems.add(new Elem(26, i + 1, 1));
                rights.put(current, elems);
            }
        }
        int[][] numPos = new int[29][s.length() + 1];
        for (int i = 0; i < s.length(); ++i) {
            int current = s.charAt(i) - 'A';
            numPos[current][i]++;
        }
        int leftDie = 0;
        int rightDie = 0;

        for (int i = 0; i < q; ++i) {
            int current = t[i].charAt(0) - 'A';
         //   System.out.println("current: " + (current));
            if (d[i].equals("L")) {
                if (current == s.charAt(0) - 'A') {
                    leftDie += numPos[current][0];
                }
                Set<Elem> left = lefts.getOrDefault(current, new HashSet<>());
                for (Elem elem : left) {
              //      System.out.println("left: " + (elem));
                    int pos = elem.pos;
                    if (pos + 1 < s.length()) {
                        if (pos >= 0) {
                            numPos[elem.value][pos] += numPos[current][pos + 1];
                        }
                        numPos[current][pos + 1] = 0;
                    }
                }


            } else {
                if (current == s.charAt(s.length() - 1) - 'A') {
                    rightDie += numPos[current][s.length() - 1];
                }
                Set<Elem> right = rights.getOrDefault(current, new HashSet<>());
                for (Elem elem : right) {
                //    System.out.println("right: " + (elem));

                    int pos = elem.pos;
                    if (pos - 1 >=0) {
                        if (pos < s.length()) {
                            numPos[elem.value][pos] += numPos[current][pos - 1];
                        }
                        numPos[current][pos - 1] = 0;

                    }
                }

            }
//            for (int j = 0; j < 6; ++j) {
//                for (int k = 0; k < s.length(); ++k) {
//                    if (numPos[j][k] > 0)
//                    System.out.println("numPos[" + j + "][" + k + "]: " + numPos[j][k]);
//                }
//            }
//            System.out.println("leftDie:" + leftDie);
//            System.out.println("rightDie: " + rightDie);
        }
//        int sum =0;
//        for (int i = 0; i < 27; ++i) {
//            for (int j = 0; j < s.length(); ++j) {
//                sum += numPos[i][j];
//            }
//        }

        System.out.println((n - leftDie - rightDie));
    }
}
