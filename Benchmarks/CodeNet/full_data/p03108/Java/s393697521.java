import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> fromList = new ArrayList<>();
        List<Integer> toList = new ArrayList<>();
        for(int i = 0;i < m;i++){
            fromList.add(sc.nextInt());
            toList.add(sc.nextInt());
        }

        Map<Integer,Integer> group = new HashMap<>();
        for(int i = 1;i < n+1;i++){
            group.put(i,i);
        }
        Map<Integer,List<Integer>> groupRev = new HashMap<>();
        for(int i = 1;i < n+1;i++){
            List<Integer> list = new ArrayList<>();
            list.add(i);
            groupRev.put(i, list);
        }

        List<Integer> ans = new ArrayList<>();
        ans.add(n*(n-1)/2);
        int ng = n+1;
        for(int i = m-1;i >= 1;i--){
            int from = fromList.get(i);
            int to = toList.get(i);
            int gfrom = group.get(from);
            int gto = group.get(to);
            ans.add(Math.max(ans.get(m-i-1) - groupRev.get(gto).size() * groupRev.get(gfrom).size(), 0));
            if(gfrom == from && gto == to){
                group.put(from,ng);
                group.put(to,ng);
                List<Integer> list = new ArrayList<>();
                list.add(from);
                list.add(to);
                groupRev.put(ng, list);
                ng++;
            } else {
                List<Integer> list = groupRev.get(gto);
                for(int num : list){
                    group.put(num, gfrom);
                }
                list.addAll(groupRev.get(to));
                groupRev.put(gfrom, list);
            }
        }

        for(int i = m-1;i >= 0;i--){
            System.out.println(ans.get(i));
        }
    }
}