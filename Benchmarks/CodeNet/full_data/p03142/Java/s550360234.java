//package AtCoder.Nekkei;

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        boolean[] visited = new boolean[n + 1];
        int[] parent = new int[n + 1];
        Arrays.fill(parent, -1);
        pair[] arr = new pair[n + m - 1];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 1; i <= n; i++) {
//            H
            set.add(i);
        }
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < n + m - 1; i++) {
            int first = s.nextInt() ;
            int secon = s.nextInt() ;
            arr[i] = new pair(first, secon);
            if(set.contains(secon)) {
                set.remove(secon);
            }
            ArrayList<Integer> list = map.getOrDefault(first, new ArrayList<>());
            list.add(secon);
            map.put(first, list);
        }
        int[] val = new int[n + 1];
        Arrays.fill(val, -1);
        Iterator<Integer> iter = set.iterator();
        int num = -1;
//        iter.forEachRemaining(integer -> val[integer] = 0);
        while(iter.hasNext()) {
            int nu = iter.next();
            if(nu != 0) {
                val[nu] = 0;
            }
        }
        for (int i = 1; i < val.length; i++) {
            if(val[i] == 0){

                num = i;
                break;
            }
        }
        parent[num] = 0;
//        System.out.println(num);
        dfs(num, visited, parent, map);
//        System.out.println(Arrays.toString(parent));
        StringBuilder ans = new StringBuilder();
        for (int i = 1; i < parent.length; i++) {
            ans.append(parent[i] + "\n");
        }
        System.out.println(ans.toString());
    }

    private static void dfs(int num, boolean[] visited, int[] parent, HashMap<Integer, ArrayList<Integer>> map) {
        if(visited[num]){
            return;
        }
        visited[num] = true;
        ArrayList<Integer> list = map.getOrDefault(num, new ArrayList<>());
        for (int i = 0; i < list.size(); i++) {
            int curr = list.get(i);
            if(!visited[curr]){
//                visited[curr] = true;
                parent[curr] = num;
                dfs(curr, visited, parent, map);
            }
        }
    }

    private static class pair {
        int src;
        int dest;

        public pair(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }

        @Override
        public boolean equals(Object obj) {
            pair p = (pair) obj;
            return this.dest == p.dest && this.src == p.src;
        }


    }
}