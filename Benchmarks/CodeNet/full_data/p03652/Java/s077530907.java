import java.util.*;

public class Main {
    static long MOD = 109+7;
    static int n, m;
    static int[][] a;

    static private class Data {
        private int id, count;
        Data(int id, int count) {
            this.id = id;
            this.count = count;
        }
    }

    static Data calcMax(Set<Integer> sports) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int j = 0;
            while(!sports.contains(a[i][j])) j++;
            int sport = a[i][j];
            int count = countMap.getOrDefault(sport, 0);
            countMap.put(sport, count  + 1);
        }

        Data data = null;
        for(int sport: countMap.keySet()) {
            int count = countMap.get(sport);
            if(data == null) data = new Data(sport, count);
            else {
                if(data.count < count) {
                    data = new Data(sport, count);
                }
            }
        }

        return data;
    }

    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        a = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j =0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        Set<Integer> sports = new HashSet<>();
        for(int i = 0; i < m; i++) sports.add(i);

        Data maxData = calcMax(sports);
        while(true) {
            sports.remove(maxData.id);
            Data curMaxData = calcMax(sports);
            if(curMaxData.count < maxData.count) {
                maxData = curMaxData;
            } else {
                break;
            }
        }

        System.out.println(maxData.count);
    }
}