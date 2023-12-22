import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int a;
        int ans = 0;
        RangeGCD dat;

        n = sc.nextInt();
        
        dat = new RangeGCD(n);
        for (int i = 0; i < n; i++){
            a = sc.nextInt();
            dat.update(i, a);
        }

        for (int i = 0; i < n; i++) {
            int tmp = dat.query(i, i + 1);
            
            dat.update(i, 0);
            ans = Math.max(ans, dat.query(0, n));
            dat.update(i, tmp);
        }

        System.out.println(ans);
    }
}

class RangeGCD extends SqrtDecomposition<Integer> {
    RangeGCD (int n) {
        super(n, 0);
    }

    protected Integer operator(Integer x, Integer y) {
        int n = Math.min(x, y);
        int m = Math.max(x, y);

        while (n > 0) {
            int r = m % n;
            m = n;
            n = r;
        }

        return m;
    }
}


/**
 * モノイドを乗せられる平方分割の抽象クラス<br>
 * operator メソッドをオーバライドすることで二項演算を定義する<br>
 * データの1点更新、区間に対する質問クエリをO(sqrt(N))で行う
 */
abstract class SqrtDecomposition<T> {

    /** 生データ */
    protected ArrayList<T> raw_data;
    /** バケットごとに事前に演算した結果を保持 */
    protected ArrayList<T> bucket;

    /** 単位元 */
    protected T e;

    /** データを分割する大きさ およそsqrt(N) */
    protected int bucket_size;
    /** 格納データ数 */
    protected int n;
    /** 分割後のデータ数 バケットの数 */
    protected int K;

    /**
     * 二項演算<br>
     * 派生先クラスでオーバーライドする
     */
    abstract protected T operator(T x, T y);

    /**
     * 要素eで埋められた要素数nmemb個の平方分割テーブルを作る
     * @param nmemb 要素数
     * @param e 初期要素(単位元であること)
     */
    public SqrtDecomposition(int nmemb, T e) {
        this.e = e;
        n = nmemb;
        bucket_size = 1;
        
        while (bucket_size * bucket_size < nmemb) {
            bucket_size++;
        }

        K = (nmemb + bucket_size - 1) / bucket_size;

        build(nmemb, e);
    }

    /**
     * size個の要素datを持った平方分割テーブルを作成
     * @param size 要素数
     * @param dat 初期要素
     */
    private void build(int size, T dat) {
        raw_data = new ArrayList<T>(size);
        bucket = new ArrayList<T>(K);

        // ArrayListにデータを追加
        for (int i = 0; i < size; i++) {
            raw_data.add(dat);
        }
        for (int i = 0; i < K; i++) {
            bucket.add(dat);
        }

        // bucketを更新
        for (int i = 0; i < K; i++) {
            update(i * bucket_size, dat);
        }
    }

    /**
     * データを更新する.<br>
     * O(sqrt(N))
     * @param k データの位置
     * @param dat 更新データ
     */
    public void update(int k, T dat) {
        raw_data.set(k, dat);

        k /= bucket_size;
        T d = e;

        for (int i = k * bucket_size; i < Math.min((k + 1) * bucket_size, n); i++) {
            d = operator(d, raw_data.get(i));
        }

        bucket.set(k, d);
    }

    /**
     * [l, r)区間の二項演算の結果を返す.<br>
     * O(sqrt(N))
     * @param l 区間の左
     * @param r 区間の右
     * @return 演算結果
     */
    public T query(int l, int r) {
        T d = e;
        int bucket_l, bucket_r;
        
        for (int k = 0; k < K; k++) {
            bucket_l = k * bucket_size;
            bucket_r = Math.min((k + 1) * bucket_size, n);

            // bucket[k]の区間がクエリ区間の外
            if (bucket_r <= l || r <= bucket_l) {
                continue;
            }
            // bucket[k]の区間がクエリ区間の中
            else if (l <= bucket_l && bucket_r <= r) {
                d = operator(d, bucket.get(k));
            }
            // bucket[k]の区間がクエリ区間と交差
            else {
                for (int i = Math.max(l, bucket_l); i < Math.min(r, bucket_r); i++) {
                    d = operator(d, raw_data.get(i));
                }
            }
        }

        return d;
    }

    /**
     * デバッグ情報を標準エラーに出力する.
     */
    public void debugPrint() {

        System.err.println("-bucket-");
        for (T p : bucket) {
            System.err.print(p);
            System.err.print(' ');
        }
        System.err.print('\n');

        System.err.println("-raw_data-");
        for (T q : raw_data) {
            System.err.print(q);
            System.err.print(' ');
        }
        System.err.print('\n');

        System.err.println("-other data-");
        System.err.printf("n: %d, bucket_size: %d, K: %d\n", n, bucket_size, K);
    }
}
