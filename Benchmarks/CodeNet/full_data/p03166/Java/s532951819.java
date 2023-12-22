import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] tmp = in.nextLine().trim().split("\\s");
        int n = Integer.parseInt(tmp[0]);
        int m = Integer.parseInt(tmp[1]);
        Map<Integer ,List<Integer>> map = new HashMap<>();
        int count = 0;
        while(count++ < m){
            tmp = in.nextLine().trim().split("\\s");
            int from = Integer.parseInt(tmp[0]);
            int to = Integer.parseInt(tmp[1]);
            map.putIfAbsent(to, new ArrayList<Integer>());
            map.get(to).add(from);
        }
        in.close();
        int[] mem = new int[n+1];
        Arrays.fill(mem, -1);
        int maxL = -1;
        
        for(int i = 1; i <= n; i++){
            maxL = Math.max(maxL, findPath(i, mem, map));
            // System.out.println(maxL);
        }
        System.out.println(maxL);
    }

    static int findPath(Integer i, int[] mem, Map<Integer,List<Integer>> map){
        if(mem[i] == -1){
            if(map.get(i) == null){
                mem[i] = 0;
            }
            else{
                int maxv = -1;
                for(int from : map.getOrDefault(i, new ArrayList<Integer>())){
                    maxv = Math.max(findPath(from, mem, map),maxv);
                }
                mem[i] = maxv + 1;
            }

        }
        return mem[i];
    }
}