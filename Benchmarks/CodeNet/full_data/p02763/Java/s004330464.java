
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        char[] chars = new char[n + 1];
        TreeSet<Integer>[] charToPos = new TreeSet[26];
        for (int i = 0; i < 26; ++i) {
            charToPos[i] = new TreeSet<>();
        }
        for (int i = 0; i < n; ++i) {
            int current = s.charAt(i) - 'a';
            chars[i + 1] = s.charAt(i);
            charToPos[current].add(i + 1);
        }
        int query = scanner.nextInt();
        for (int i = 0; i < query; ++i) {
            int type = scanner.nextInt();

            if (type == 1) {
                int a = scanner.nextInt();
                int newChar = scanner.next().charAt(0) - 'a';
                int oldChar = chars[a] - 'a';
                charToPos[oldChar].remove(a);
                charToPos[newChar].add(a);
                chars[a] = (char)(newChar + 'a');
            } else if (type == 2) {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                int diff = 0;
                for (int j = 0; j < 26; ++j) {
                    if (charToPos[j].isEmpty()) {
                        continue;
                    }
                    TreeSet<Integer> poses = charToPos[j];
                    if (poses.contains(l) || poses.contains(r)) {
                        ++diff;
                        continue;
                    }
                    NavigableSet<Integer> lessLNum = poses.headSet(l, false);
                    NavigableSet<Integer> largerRNum = poses.tailSet(r, false);

                    long count = poses.size() - largerRNum.size() - lessLNum.size();
                    if (count > 0) {
                        ++diff;
                    }
                }
                System.out.println(diff);
                //  System.out.println("===========");
            }
        }
    }
}

