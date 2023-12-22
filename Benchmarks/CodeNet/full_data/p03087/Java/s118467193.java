import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by bi16060 on 2019/03/24.
 */
public class Main {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n, q;
        String line[] = br.readLine().split(" ");
        n = Integer.parseInt(line[0]);
        q = Integer.parseInt(line[1]);

        String s = br.readLine();

        for(int i = 0; i < q; i++){
            line = br.readLine().split(" ");
            int start = Integer.parseInt(line[0]);
            int end     = Integer.parseInt(line[1]);
            System.out.println(regex(s.substring(start - 1, end), "AC"));

        }


    }
    static int regex(String str, String target){
        Pattern p = Pattern.compile(target + "");
        Matcher m = p.matcher(str);
        int count = 0;

        while(m.find()){
            count++;
        }

        return count;
    }
}
