import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private static PrintWriter pw = new PrintWriter(System.out);
    public static void main(String[] args) throws IOException {
        func();
        pw.flush();
        return;
    }

    static void func() throws IOException {
        int[] input = arrayOfInt();
        int n = input[0];
        int a = input[1];
        int b = input[2];

        println(n * a > b ? b : n * a);
    }
    // 入力受け取り
    static String next() throws IOException {return br.readLine();}
    static int nextInt() throws IOException{return getInt(br.readLine());}
    static long nextLong() throws IOException{return getLong(br.readLine());}
    static String[] arrayOfString() throws IOException{return br.readLine().split(" ");}
    static int[] arrayOfInt() throws IOException{return toIntArray(arrayOfString());}
    // 変換
    static String getString(int val) {return Integer.toString(val);}
    static String getString(char val) {return Character.toString(val);}
    static long getLong(String val) {return Long.parseLong(val);}
    static int getInt(String val) {return Integer.parseInt(val);}
    static int getInt(char val) {return Integer.parseInt(getString(val));}
    static int[] toIntArray(String[] array) {
        return Stream.of(array.clone()).mapToInt(Integer::parseInt).toArray();
    }
    static String joinToString(String[] array) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < array.length;i++) sb.append(array[i]);
        return sb.toString();
    }
    static int[] listToIntArray(List<Integer> list){
        int[] ret = new int[list.size()];
        for(int i = 0;i < ret.length;i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }

    // ソート
    static int[] sortn(int[] ary) {
        Arrays.sort(ary);
        return ary;
    }
    static int[] sortr(int[] ary) {
        return Arrays.stream(ary).boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }


    // 計算系
    static int[] divisor(int val){
        List<Integer> divisor = new ArrayList<>();
        for (int i = 1; i*i <= val; i++) {
            if (val % i != 0) continue;
            divisor.add(i);
            divisor.add(val/i);
        }
        int[] result = listToIntArray(divisor);
        Arrays.sort(result);
        return result;
    }
    static int[] prime(int from, int to){
        return IntStream.rangeClosed(from, to)
                .filter(i -> IntStream.rangeClosed(2, (int)Math.sqrt(i)).allMatch(j -> i%j !=0))
                .toArray();
    }
    static int[] decom(int n){
        if(n == 1) {
            int[] ret = new int[1];
            ret[0] = 1;
            return ret;
        }
        List<Integer> ret = new ArrayList<>();
        for(int i = 2;i * i <= n;i++){
            if(n % i == 0){
                n /= i;
                ret.add(i);
            }
        }
        return listToIntArray(ret);
    }
    static int gcd(int a,int b){
        return  a%b == 0 ? b : gcd(b, a%b);
    }

    // 文字列編集
    static String swap(String s,String a, String b){
        char A = a.charAt(0);
        char B = b.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int j = 0;j < s.length();j++){
            if(s.charAt(j) == A) {
                sb.append(b);
            } else if(s.charAt(j) == B) {
                sb.append(a);
            } else{
                sb.append(s.charAt(j));
            }
        }
        return sb.toString();
    }

    // 出力
    static void println(Object val){pw.println(val);}
}