import java.util.*;

public class Main {

    static int[][] AB;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  H = sc.nextInt();
        int  N = sc.nextInt();

        AB = new int[N][2];
        for (int i = 0; i < N; i++) {
            AB[i][0]= sc.nextInt();
            AB[i][1]= sc.nextInt();
        }
        System.out.println(dfs(H,0));

    }
    static Map<String,Integer> m = new HashMap<>();
    static private int dfs(int hp, int mp){

        if(m.containsKey(hp+":"+mp)){
            return m.get(hp+":"+mp);
        }
        if(hp<=0) return mp;

        int minMP = Integer.MAX_VALUE;
        for (int i = 0; i < AB.length; i++) {
            int damage= AB[i][0];
            int mpused= AB[i][1];

            int minMP2 = dfs(hp-damage,mp+mpused);
            minMP=Math.min(minMP,minMP2);
        }

        m.put(hp+":"+mp,minMP);

        return minMP;
    }


}
