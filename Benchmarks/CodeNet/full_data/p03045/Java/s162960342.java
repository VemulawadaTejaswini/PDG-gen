import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] groups = new int[n];
        for(int i=0; i<n; i++) {
            groups[i] = 0;
        }

        List<Tuple> tuples = new ArrayList<>(m);
        for(int i=0; i<m; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            Tuple t = new Tuple();
            t.x = x;
            t.y = y;
            tuples.add(t);
        }
        Collections.sort(tuples);

        int currentGroup = 0;

        for(int i=0; i<m; i++) {
            Tuple t = tuples.get(i);
            int x = t.x;
            int y = t.y;
            if(groups[x-1] > 0) {
                groups[y-1] = groups[x-1];
            }
            else if(groups[y-1] > 0) {
                groups[x-1] = groups[y-1];
            }
            else {
                currentGroup++;
                groups[x-1] = currentGroup;
                groups[y-1] = currentGroup;
            }
        }
        for(int i=0; i<n; i++) {
            if(groups[i] == 0) {
                currentGroup++;
            }
        }
        System.out.println(currentGroup);
    }
}
class Tuple implements Comparable<Tuple> {
    int x;
    int y;

    @Override
    public int compareTo(Tuple o) {
        if(this.x == o.x) {
            return this.y - o.y;
        }
        return this.x - o.x;
    }
}
