import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class Main {

    static boolean succeeded;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long m = scanner.nextInt();
        long[] a = new long[n];
        Block[] blocks = new Block[n];
        for (int i = 0; i < a.length; ++i) {
            a[i] = scanner.nextInt() % m;
        }
        for (int i = 0;i < a.length;++i){
            long k = a[i];
            if(a[i] == 0){
                blocks[i] = new Block(i,i);
                continue;
            }
            for (int j = i + 1;j < a.length;++j){
                k += a[j];
                if(k % m == 0){
                    blocks[i] = new Block(i,j);
                    break;
                }
            }
        }
        int f = 0;
        for (Block block1:blocks){
            if(block1 == null)continue;
            ++f;
            int k = block1.end + 1;
            while (k < blocks.length && blocks[k] != null){
                ++f;
                k = blocks[k].end + 1;
            }
        }
        System.out.println(f);
    }

    static class Block{
        public int start,end;
        public Block(int start,int end){
            this.start = start;this.end = end;
        }

    }


}
