import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
    /**
     * Iterate through each line of input.
     */
    int[] array;
    String answer = "";

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run(){
        Scanner sc = new Scanner(System.in);
        char[] input = sc.next().toCharArray();
        array = new int[input.length];

        for(int i=0; i<input.length; i++){
            array[i] = Character.getNumericValue(input[i]);
        }

        dfs(0, array[0], String.valueOf(array[0]));
        System.out.println(answer);
    }

    void dfs(int x, int sum, String ans){
        if(sum == 7){
            for(int i=x; i<array.length-1; i++){
                ans += "+0";
            }
            answer = ans + "=7";
            return;
        }

        if(x >= array.length-1){
            return;
        }

        dfs(x+1, sum + array[x+1], ans + "+" + array[x+1]);
        dfs(x+1, sum - array[x+1], ans + "-" + array[x+1]);
    }

    void bit(){
        String[] c = {"a", "b", "c"};
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 1 << c.length; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < c.length; j++) {
                if ((i >> j & 1) == 1) {
                    sb.append(c[j]);
                }
            }
            list.add(sb.toString());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ":" + list.get(i));
        }
    }
}

class Dfs {
    long allSum = 0;
    char[] array;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run(){
        Scanner sc = new Scanner(System.in);
        array = sc.next().toCharArray();
        solve();
    }

    void solve(){
        dfs(0, 0, 0);
        System.out.println(allSum);
    }

    void dfs(int pointer, long sum, long rem) {
        System.out.println(rem);
        if (pointer == array.length - 1) {
            allSum += sum + Character.getNumericValue(array[pointer]) + rem * 10;
            return;
        }
        int num = Character.getNumericValue(array[pointer]);
        dfs(pointer + 1, sum + rem * 10 + num, 0);
        dfs(pointer + 1, sum, rem * 10 + num);
    }
}
