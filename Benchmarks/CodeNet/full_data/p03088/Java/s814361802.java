//package Beginner122;

import java.util.*;

public class Main {
    static HashSet<String> set;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Character> list = new ArrayList<>();
        set = new HashSet<>();
        list.add('A');
        list.add('C');
        list.add('G');
        list.add('T');
        int ans = 0;
        if (n == 3) {
            System.out.println(61);
            return;
        }
//        HashSet<String> set1 = func1(n);
//        HashSet<String> set2 = new HashSet<>();
//        for (String str : set1) {
//            if(str.contains("AGC") || str.contains("ACG") || str.contains("GAC") || str.contains("AGAC") ||str.contains("AGTC") ||str.contains("AGGC") ||str.contains("ATGC") || str.contains("ACGC") ) {
////                set1.remove(str);
//            } else {
//                set2.add(str);
//            }
//        }
        int ans1 = 0;

        HashMap<pair, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                for (int k = 0; k < list.size(); k++) {
                    if (i == 0 && j == 2 && k == 1) {
                        continue;
                    }

                    if (i == 2 && j == 0 && k == 1) {
                        continue;
                    }

                    if (i == 0 && j == 1 && k == 2) {
                        continue;
                    }
//                    ans += func(3, n, i, j, k);
                    ans += func(3, n - 1, list.get(i) + "" + list.get(j) + "" + list.get(k), map);
//                    ans1 += func2(3, n, i, j, k);

                }
            }
        }
//        System.out.println(set2.size());
//        System.out.println(set.size());
        System.out.println(ans);
//        System.out.println(ans1);
//        set.removeAll(set2);
//        System.out.println(set);
    }

    private static HashSet<String> func1(int n) {
        if(n == 1) {
            HashSet<String> ans = new HashSet<>();
            ans.add("A");
            ans.add("G");
            ans.add("T");
            ans.add("C");
            return ans;
        }

        HashSet<String> small1 = func1(n - 1);
        ArrayList<String> small = new ArrayList<>(small1);
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 0; i < small.size(); i++) {
            ans.add("A" + small.get(i));
            ans.add("G" + small.get(i));
            ans.add("T" + small.get(i));
            ans.add("C" + small.get(i));
        }
        HashSet<String> fin = new HashSet<>(ans);
        return fin;


    }

    private static int func(int start, int n, String str, HashMap<pair, Integer> map) {
        int ans = 0;
        if(map.containsKey(new pair(start, str))) {
            return map.get(new pair(start, str));
        }
        char prev = str.charAt(start - 1);
        char bPrev = str.charAt(start - 2);
        char bpp = str.charAt(start - 3);
        if (prev == 'C' && bPrev == 'A') {
            if (start == n) {
//                set.add(str + "A");
//                set.add(str + "C");
//                set.add(str + "T");
                return 3;

            }
            ans += func(start + 1, n, str + "A", map);
            ans += func(start + 1, n, str + "C", map);
            ans += func(start + 1, n, str + "T", map);
        } else if (prev == 'A' && bPrev == 'G') {
            if (start == n) {
//
//                set.add(str + "A");
//                set.add(str + "G");
//                set.add(str + "T");
                return 3;
            }
            ans += func(start + 1, n, str + "A", map);
            ans += func(start + 1, n, str + "G", map);
            ans += func(start + 1, n, str + "T", map);
        } else if (prev == 'G' && bPrev == 'A') {
            if (start == n) {
//
//                set.add(str + "A");
//                set.add(str + "G");
//                set.add(str + "T");
                return 3;
            }
            ans += func(start + 1, n, str + "A", map);
            ans += func(start + 1, n, str + "G", map);
            ans += func(start + 1, n, str + "T", map);
        } else {
            if (bPrev == 'G' && bpp == 'A') {
                if (start == n) {
//
//                    set.add(str + "A");
//                    set.add(str + "G");
//                    set.add(str + "T");
                    return 3;
                }
                ans += func(start + 1, n, str + "A", map);
                ans += func(start + 1, n, str + "G", map);
                ans += func(start + 1, n, str + "T", map);
            } else if (prev == 'G' && bpp == 'A') {
                if (start == n) {
//
//                    set.add(str + "A");
//                    set.add(str + "G");
//                    set.add(str + "T");
                    return 3;
                }
                ans += func(start + 1, n, str + "A", map);
                ans += func(start + 1, n, str + "G", map);
                ans += func(start + 1, n, str + "T", map);
            } else {
                if (start == n) {
//                    set.add(str + "C");
//                    set.add(str + "A");
//                    set.add(str + "G");
//                    set.add(str + "T");
                    return 4;
                }
                ans += func(start + 1, n, str + "A", map);
                ans += func(start + 1, n, str + "C", map);
                ans += func(start + 1, n, str + "G", map);
                ans += func(start + 1, n, str + "T", map);
            }
        }
        map.put(new pair(start, str), ans);
        return ans;
    }

    private static class pair {
        int start;
        String str;

        public pair(int start, String str) {
            this.start = start;
            this.str = str;
        }

        @Override
        public boolean equals(Object obj) {
            pair p = (pair) obj;
            return this.start == p.start && this.str.equals(p.str);
        }

        @Override
        public int hashCode() {
            return Integer.hashCode(this.start) + str.hashCode();
        }


    }

    private static  int func2(int start, int n, int prev, int bPrev, int bpp){
        int ans = 0;
        if (prev == 1 && bPrev == 0) {
            if (start == n - 1) {
//                set.add(str + "A");
//                set.add(str + "C");
//                set.add(str + "T");
                return 3;

            }
            ans += func2(start + 1, n, 0,prev, bPrev);
            ans += func2(start + 1, n, 1,prev, bPrev);
            ans += func2(start + 1, n, 3,prev, bPrev);
        } else if (prev == 0 && bPrev == 2) {
            if (start == n - 1) {
//
//                set.add(str + "A");
//                set.add(str + "G");
//                set.add(str + "T");
                return 3;
            }
            ans += func2(start + 1, n, 0,prev, bPrev);
            ans += func2(start + 1, n, 2,prev, bPrev);
            ans += func2(start + 1, n, 3,prev, bPrev);
        } else if (prev == 2 && bPrev == 0) {
            if (start == n - 1) {

//                set.add(str + "A");
//                set.add(str + "G");
//                set.add(str + "T");
                return 3;
            }
            ans += func2(start + 1, n, 0,prev, bPrev);
            ans += func2(start + 1, n, 2,prev, bPrev);
            ans += func2(start + 1, n, 3,prev, bPrev);
        } else {
            if (bPrev == 2 && bpp == 0) {
                if (start == n - 1) {

//                    set.add(str + "A");
//                    set.add(str + "G");
//                    set.add(str + "T");
                    return 3;
                }
                ans += func2(start + 1, n, 0,prev, bPrev);
                ans += func2(start + 1, n, 2,prev, bPrev);
                ans += func2(start + 1, n, 3,prev, bPrev);
            } else if (prev == 2 && bpp == 0) {
                if (start == n - 1) {

//                    set.add(str + "A");
//                    set.add(str + "G");
//                    set.add(str + "T");
                    return 3;
                }
                ans += func2(start + 1, n, 0,prev, bPrev);
                ans += func2(start + 1, n, 2,prev, bPrev);
                ans += func2(start + 1, n, 3,prev, bPrev);
            } else {
                if (start == n - 1) {
//                    set.add(str + "C");
//                    set.add(str + "A");
//                    set.add(str + "G");
//                    set.add(str + "T");
                    return 4;
                }
                ans += func2(start + 1, n, 0,prev, bPrev);
                ans += func2(start + 1, n, 1,prev, bPrev);
                ans += func2(start + 1, n, 2,prev, bPrev);
                ans += func2(start + 1, n, 3,prev, bPrev);
            }
        }
        return ans;
    }
}

/*

 * */