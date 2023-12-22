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
        Stream<String> lines = br.lines();
        
        // データからパラメータを割り出す
        Stream<String> a = lines.filter(item -> item.indexOf(" ") < 0);

        // 変換処理、出力
        int W = 0;
        boolean isFirst = true;
        for (Object item : a.map(item -> "#" + item + "#").toArray()) {
            String out = item.toString();
            if (isFirst) {
                isFirst = false;
                W = out.length();
                System.out.println(new String(new char[W]).replace("\0", "#"));
            }
            System.out.println(out);
        }
        System.out.print(new String(new char[W]).replace("\0", "#"));
    }
}
