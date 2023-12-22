import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        AB[] ab = new AB[N];
        PriorityQueue<Integer> queue = new PriorityQueue<>(
                Comparator.reverseOrder());
        for (int i = 0; i < N; i++) {
            ab[i] = new AB(sc.nextInt(), sc.nextInt());
        }
        // 振込が早い順にソート 昇順
        Arrays.sort(ab, (a, b) -> a.a - b.a);
        int ans = 0;
        int ptr = 0;
        // A日後に報酬B
        // 受けたことのある仕事はできない
        // 一番報酬が高い ∧ 日数が担保されてる
        // PriorityQueue add=offer
        for (int Mi = 1; Mi <= M; Mi++) {
//            for (int Ni = ptr; Ni < N; Ni++) {
//                if (ab[Ni].a <= Mi) {
            while(ptr < N && ab[ptr].a <= Mi) {
                    queue.add(ab[ptr].b);
                    ptr++;
                }
            
            if (queue.isEmpty())
                continue;
            ans += queue.poll();
        }

        // System.out.println(queue);

        // for (int i = 1; i <= M; i++) {
        // //ptrはどの配列まで検査したか
        // //ptrが件数よりも小さい &&
        // while (ptr < N && ab[ptr].a <= i) {
        // queue.add(ab[ptr].b);
        // ptr++;
        // System.out.println("i :"+i+", ab: "+ab[ptr].b+", ptr: " +ptr);
        // }
        // if (queue.isEmpty()) continue;
        // ans += queue.poll();
        // }

        System.out.println(ans);
    }

    static class AB {
        int a, b;

        AB(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}