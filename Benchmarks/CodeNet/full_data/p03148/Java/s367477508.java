import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Sushi[] sushis = new Sushi[n];
        for(int i = 0; i < n; i++) {
            sushis[i] = new Sushi(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(sushis, (a, b) -> b.deliciousness - a.deliciousness);
        Stack<Sushi> extra = new Stack<>();
        HashSet<Integer> tasteSet = new HashSet<>();
        long tasteCount = 0;
        long totalDeliciousness = 0;
        for(int i = 0; i < k; i++) {
            Sushi s = sushis[i];
            if(!tasteSet.contains(s.taste)) {
                tasteSet.add(s.taste);
                tasteCount++;
            } else {
                extra.push(s);
            }
            totalDeliciousness += s.deliciousness;
        }
        long satisfaction = totalDeliciousness + (tasteCount * tasteCount);
        for(int i = k; i < n && extra.size() > 0; i++) {
            Sushi s = sushis[i];
            if(!tasteSet.contains(s.taste)) {
                tasteCount++;
                tasteSet.add(s.taste);
                totalDeliciousness -= extra.pop().deliciousness;
                totalDeliciousness += s.deliciousness;
                satisfaction = Math.max(satisfaction, totalDeliciousness + (tasteCount * tasteCount));
            }
        }
        System.out.println(satisfaction);
    }

    private static class Sushi {
        int taste;
        int deliciousness;
        Sushi(int t, int d) {
            taste = t;
            deliciousness = d;
        }
    }
}
