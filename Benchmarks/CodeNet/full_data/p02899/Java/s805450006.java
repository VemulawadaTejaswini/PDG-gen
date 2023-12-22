import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Element> set = new TreeSet<>();
        for (int i = 1; i <= n; i++) {
            int seq = sc.nextInt();
            set.add(new Element(i, seq));
        }
//        System.out.println(set);
        String ans = set.stream().map(e -> String.valueOf(e.no)).collect(Collectors.joining(" "));
        System.out.println(ans);

        sc.close();
    }

    static class Element implements Comparable<Element> {
        int no; // 出席番号
        int seq; // 到着順序

        public Element(int no, int seq) {
            this.no = no;
            this.seq = seq;
        }

        @Override
        public int compareTo(Element o) {
            return seq - o.seq;
        }

        @Override
        public String toString() {
            return "no=" + no + ", seq=" + seq;
        }
    }
}
