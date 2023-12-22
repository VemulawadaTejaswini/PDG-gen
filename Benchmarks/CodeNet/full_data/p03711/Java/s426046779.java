import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main
{
    /**
     * ABC 062 B: Picture Frame
     *     (周囲1ピクセルを'#'で囲む)
     */ 
    public static void main(String[] args) throws IOException
    {
        // 入力
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        int[] HW = Stream.of(br.readLine().split(" ")).mapToInt(
                item -> new Integer(item)).toArray();
        Stream<String> lines = br.lines();
        
        // データからパラメータを割り出す
        Stream<String> a = lines.filter(item -> item.indexOf(" ") < 0);

        // 変換処理、出力
        Stream<String> border_s = Stream.of(new String(new char[HW[1]]).replace("\0", "#"));
        Stream<String> border_e = Stream.of(new String(new char[HW[1]]).replace("\0", "#"));
        Stream<String> out = Stream.concat(border_s, Stream.concat(a, border_e));
        
        System.out.print(out.map(item -> "#" + item + "#").collect(Collectors.joining("\n")));
    }
}
