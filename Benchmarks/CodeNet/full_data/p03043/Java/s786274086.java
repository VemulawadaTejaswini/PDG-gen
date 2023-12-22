import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double K = (double)sc.nextInt();

        sc.close();

        Fraction sum = new Fraction(0, 1);

        for(int i=1; i<=N; i++){
            int denominator = N;
            if(i < K){
                denominator *= (int)(Math.pow(2, Math.ceil(Math.log(K/i) / Math.log(2))));
            }
            //int denominator = (int)(Math.pow(2, Math.ceil(Math.log(K/i) / Math.log(2))) * N);
            System.err.println(denominator); //#############
            if (denominator == 0) continue;
            Fraction tmp = new Fraction(1, denominator);
            sum.addition(tmp);
        }

        System.err.println(sum.getNumerator());//#############
        System.err.println(sum.getDenominator());//#############
        double result = sum.getNumerator().doubleValue() / sum.getDenominator().doubleValue();
        System.out.println(result);
    }
}

//コピペ
// https://gist.github.com/namiken/363bc136d7a2f1809d6b
/**
 * 分数の値、および計算メソッドを保持するクラス。計算メソッドを利用すると自信の分数の値が書き換わる。(引数の値は書き換わりません)
 *
 */
class Fraction {
    /**
     *  分子
     */
    private BigInteger numerator;

    /**
     *  分母
     */
    private BigInteger denominator;

    /**分数を作る
     * @param numerator 分子
     * @param denominator 分母
     */
    public Fraction(int numerator, int denominator) {
        //分母がゼロならエラー
        if (denominator == 0) {
            throw new RuntimeException("denominator is not permission 'zero'");
        }
        this.numerator = BigInteger.valueOf(numerator);
        this.denominator = BigInteger.valueOf(denominator);

        reduction();
    }

    /**
     * 約分を行う
     */
    private void reduction() {
        BigInteger gcdi = gcdi(numerator, denominator);
        numerator = numerator.divide(gcdi);
        denominator = denominator.divide(gcdi);
    }

    /**
     * 引数の分数を加える
     * @param fraction
     * @return
     */
    public void addition(Fraction fraction) {
        numerator =  fraction.denominator.multiply(numerator).add(fraction.numerator.multiply(denominator));
        denominator = denominator.multiply(fraction.denominator);

        reduction();
    }

    /**
     * 引数の分数を引く
     * @param fraction 引かれる数
     * @return
     */
    public void subtraction(Fraction fraction) {
        numerator = fraction.denominator.multiply(numerator).subtract(fraction.numerator.multiply(denominator));
        denominator = denominator.multiply(fraction.denominator);

        reduction();
    }

    /**
     * 引数の分数を掛ける
     * @param fraction
     * @return
     */
    public void multiplication(Fraction fraction) {
        denominator = denominator.multiply(fraction.denominator);
        numerator = numerator.multiply(fraction.numerator);

        reduction();
    }

    /**
     * 引数の分数を割る
     * @param fraction 割られる数
     * @return
     */
    public void division(Fraction fraction) {
        denominator = denominator.multiply(fraction.numerator);
        numerator = numerator.multiply(fraction.denominator);

        reduction();
    }

    /**
     * 分子を返す
     * @return
     */
    public BigInteger getNumerator() {
        return numerator;
    }

    /**
     * 分母を返す
     * @return
     */
    public BigInteger getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        //分母が1のときは分子だけ返す
        if (denominator == BigInteger.ONE) {
            return numerator.toString();
        }
        return numerator + "/" + denominator;
    }

    /**
     * 最大公約数を求める
     * @param a
     * @param b
     * @return
     */
    private static BigInteger gcdi(BigInteger a, BigInteger b) {
        BigInteger gcd = a.gcd(b);
        //int result = gcd.intValue();
        //System.err.println("GCD:" + result);
        return gcd;
    }
}