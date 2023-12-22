import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Main {

    static void solve() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int[] arr = new int[n];
        for (int i=1;i<n;i++) {
            for (int j=i+1;j<=n;j++) {
                int min = j-i;
                if(i<=x && j>=x && j<=y) {
                    int s = (x-i) + 1 + (y-j);
                    min = Math.min(min,s);
                } else if(i<=x && j>=y) {
                    int s = (x-i) + 1 + (j-y);
                    min = Math.min(min,s);
                } else if(i>=x) {
                    if(j<=y) {
                        int s = (i-x) + 1 + (y-j);
                        min = Math.min(min,s);
                    }else{
                        int s = (i-x) + 1 + (j-y);
                        min = Math.min(min,s);
                    }

                }
                arr[min]++;
            }
        }
        for (int i=1;i<n;i++) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {

        solve();

        //        Main m = new Main();
        //        Scanner scan = new Scanner(System.in);

        //        long n = scan.nextLong();
        //        long r = scan.nextLong();
        //        List<Long> list = new ArrayList<>();
        ////        int[] arr = new int[n];
        //        for (long i=0;i<n;i++){
        //            list.add(scan.nextLong());
        //        }
//            System.out.println(ch);
        //        solve(n, arr);
        //        scan.close();
    }


    class Counter extends HashMap<Integer, Integer> {
        public int get(int k) {
            return containsKey(k) ? super.get(k) : 0;
        }

        public void add(int k, int v) {
            put(k, get(k) + v);
        }
    }



    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

//    static class Node {
//        int key;
//        int data;
//        Node next;
//        Node prev;
//
//        Node(int key, int data) {
//            this.key = key;
//            this.data = data;
//        }
//    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static class Trie {
        void add(String word) {

        }

        boolean search(String w) {
            return false;
        }
    }

    static class Node1 {
        public int val;
        public List<Node1> children;

        public Node1() {
        }

        public Node1(int _val, List<Node1> _children) {
            val = _val;
            children = _children;
        }
    }

    ;

    static class TrieNode {

    }

    static class KvNode implements Comparable<KvNode> {
        String key;
        int freq;

        public KvNode(String key, int freq) {
            this.key = key;
            this.freq = freq;
        }

        @Override
        public int compareTo(KvNode o) {
            if (this.key.equals(o.key)) {
                return 0;
            }
            return Integer.compare(o.freq, this.freq);
        }
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
