import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    int[] inputArray;
    Set<String> set = new HashSet<>();
    int K;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println((int)notSameColorInRow(n, k));
    }

    //隣合わないように色を並べる
    double notSameColorInRow(int n, int k){
        return k * Math.pow(k-1, n-1);
    }

    double manhattan(Ten point1, Ten point2){
        return Math.abs(point1.getX() - point2.getX()) + Math.abs(point1.getY() - point2.getY());
    }

    void substring(String s, int num){
        for(int i=1; i<=num; i++){
            if(i > K){
                break;
            }
            for(int j=0; j<num; j++){
                if(j + i-1 < num){
//                    System.out.println(s.substring(j, j+i));
                    set.add(s.substring(j, j+i));
                } else {
                    break;
                }
            }
        }
    }

    void permutation(String s, String ans){
        if(s.length() <= 1){
//            System.out.println(ans + s);
        } else {
            for(int i=0; i<s.length(); i++){
                permutation(s.substring(0, i) + s.substring(i + 1), ans + s.charAt(i));
            }
        }
    }

    //a以上b以下の数でxで割り切れるものの数をf(n)と置くと、
    //f(n) = f(b) - f(a-1)
    BigDecimal nbCanDivide(BigDecimal a, BigDecimal b, BigDecimal x){
//        System.out.println(String.format("%s %s %s", a, b, x));
        return canDivide(b, x).subtract(canDivide(a.subtract(BigDecimal.valueOf(1)), x));
    }
    BigDecimal canDivide(BigDecimal i, BigDecimal x){
//        System.out.println(String.format("%s %s", i, x));
        if(i.compareTo(BigDecimal.valueOf(0)) != -1){
//            System.out.println(((i/x) + 1));
            return i.divide(x, 1).add(BigDecimal.valueOf(1));
        } else {
            return BigDecimal.valueOf(0);
        }
    }

}

class Ten{
    private int x;
    private int y;

    Ten(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
