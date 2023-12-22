import java.util.*;
public class Main {
    public static void main(String[] args) {
        int val;
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
//        String[] s = new String[n];
//        HashMap<String, LinkedList<Integer>> map = new HashMap<>();
//        String city;
//        int point;
//        int[] score = new int[n];
//        for (int i = 0; i < n; i++) {
//            city = sc.next();
//            point = sc.nextInt();
//            if (map.containsKey(city)){
//                map.getOrDefault(city).add(point)
//            }
//        }

        List<c> first = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            first.add(new c(sc.next(), i+1, sc.nextInt()));
        }

    first.sort((s1, s2) -> {
        if (s1.s.equals(s2.s)){
            return s2.p - s1.p;
        } else{
            return s1.s.compareTo(s2.s);
        }
    });
        for (c eachc:
             first) {
            System.out.println(eachc.i);
        }
    }

    static class c {
        String s;
        int i;
        int p;

        public c(String s, int i, int p){
            this.s = s;
            this.i = i;
            this.p = p;
        }
    }
}