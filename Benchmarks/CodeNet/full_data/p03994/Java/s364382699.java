import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
        // 解答
        Map<String, Integer> map = new HashMap<String, Integer>() {
            {put("a", 1);}
            {put("b", 2);}
            {put("c", 3);}
            {put("d", 4);}
            {put("e", 5);}
            {put("f", 6);}
            {put("g", 7);}
            {put("h", 8);}
            {put("i", 9);}
            {put("j", 10);}
            {put("k", 11);}
            {put("l", 12);}
            {put("m", 13);}
            {put("n", 14);}
            {put("o", 15);}
            {put("p", 16);}
            {put("q", 17);}
            {put("r", 18);}
            {put("s", 19);}
            {put("t", 20);}
            {put("u", 21);}
            {put("v", 22);}
            {put("w", 23);}
            {put("x", 24);}
            {put("y", 25);}
            {put("z", 26);}
        };

        Map<Integer, String> map2 = new HashMap<Integer, String>() {
            {put(1, "a");}
            {put(2, "b");}
            {put(3, "c");}
            {put(4, "d");}
            {put(5, "e");}
            {put(6, "f");}
            {put(7, "g");}
            {put(8, "h");}
            {put(9, "i");}
            {put(10, "j");}
            {put(11, "k");}
            {put(12, "l");}
            {put(13, "n");}
            {put(14, "m");}
            {put(15, "o");}
            {put(16, "p");}
            {put(17, "q");}
            {put(18, "r");}
            {put(19, "s");}
            {put(20, "t");}
            {put(21, "u");}
            {put(22, "v");}
            {put(23, "w");}
            {put(24, "x");}
            {put(25, "y");}
            {put(26, "z");}
        };
        String s = next();
        int n = nextInt();

        List<Integer> list = new ArrayList<>();
        int now = n;
        for(int i = 0;i < s.length();i++){
            String tmp = Character.toString(s.charAt(i));
            if(map.get(tmp) + now > 26){
                int minus = 27 - map.get(tmp);
                list.add(1);
                now -= minus;
                continue;
            }else if(i != s.length() - 1) {
                list.add(map.get(tmp));
            }
            if(i == s.length() - 1 && now > 0) {
                int last = map.get(tmp) + now;
                while(last > 26) { last -= 26;}
                list.add(last);
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        list.forEach(i -> sb.append(map2.get(i)));
        println(sb.toString());
    }
    // 入力受け取り
    static String next() throws IOException {return br.readLine();}
    static int nextInt() throws IOException{return getInt(br.readLine());}
    static long nextLong() throws IOException{return getLong(br.readLine());}
    static String[] arrayOfString() throws IOException{return br.readLine().split(" ");}
    static int[] arrayOfInt() throws IOException{return toIntArray(arrayOfString());}
    // 変換
    static String getString(int val) {return Integer.toString(val);}
    static long getLong(String val) {return Long.parseLong(val);}
    static int getInt(String val) {return Integer.parseInt(val);}
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
