import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        solve(System.in, System.out);
    }

    static void solve(InputStream is, PrintStream os) {
        // Your code here!
        Scanner scan = new Scanner(is);
        int N = scan.nextInt();
        int M = scan.nextInt();
        LinkedList<Integer> A = new LinkedList<Integer>();
        for(int i = 0; i < N; i++) {
            A.add(scan.nextInt());
        }
        Collections.sort(A, Collections.reverseOrder());

        for(int i = 0; i < M; i++) {
            int a = A.get(0);
            a = (int) (Math.floor((double) a / 2.0));
            if (N > 1 && A.get(1) > a) {
                A.remove(0);
                int idx = Collections.binarySearch(A.subList(0, N-1 < M-1-i ? N-1 : M-1-i), a, Collections.reverseOrder());

                if( idx < 0 ){
                    // 0より下の場合はリスト内に要素が無い。
                    // (-(挿入ポイント)-1)　という値なので本来の挿入ポイントを求める
                    idx = -idx -1;
                }

                if( A.size() <= idx ){
                    // リストのサイズ以上の位置ならばリストの最後尾に追加
                    A.addLast(a);
                }
                else{
                    A.add(idx,a);
                }
            } else {
                A.set(0, a);
            }
        }

        long sum = 0;
        for(int i = 0; i < N; i++) {
            sum += A.get(i);
        }
        os.println(sum);
    }
}