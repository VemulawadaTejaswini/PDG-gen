import java.util.*;
public class Main {
    private static long dp[][];
    private static int N;
    private static int A[];
    private static int B[];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        myClass mc = new myClass(A[0],A[1]);
        for(int i=2; i<N; i++) {
            mc.insert(A[i]);
        }
        mc.dump();
        System.out.println(String.format("%d", mc.getDiffsum()));
    }

    static class myClass {
        LinkedList<Integer> lli = new LinkedList<>();
        long diffsum = 0L;

        myClass(int a, int b) {
            lli.add(a);
            lli.add(b);
            diffsum = Math.abs(a-b);
        }

        long getDiffsum() { return diffsum;}

        void insert(int x) {
            int tmppos = 0;
            int index=0;
            long tmpsum = diffsum;
            int before = -1;

            for(Integer i : lli) {
                if(before == -1) {
                    tmpsum += Math.abs(x-i);
                    before = i;
                    index++;
                    continue;
                }
                long hoge = diffsum - (Math.abs(before - i)) + (Math.abs(before-x)) + (Math.abs(x-i));
                before = i;
                if(hoge>tmpsum) {
                    tmpsum = hoge;
                    tmppos = index;
                    index++;
                    continue;
                }
            }
            // 末尾のケースを計算
            int tail = lli.getLast();
            long fuga = diffsum + Math.abs(tail-x);
            if(fuga>tmpsum) {
                diffsum = fuga;
                lli.addLast(x);
                dump();
                return;
            }
            // 末尾以外のケース
            lli.add(tmppos, x);
            diffsum = tmpsum;
            dump();
        }

        void dump() {
            return;
            /*
            for(Integer i : lli) {
                System.out.print(String.format("%d,", i));
            }
            System.out.println(String.format("diffsum:%d", diffsum));
            */
        }
    }
}