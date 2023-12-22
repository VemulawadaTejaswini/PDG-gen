import java.io.BufferedReader;
import java.io.InputStreamReader;

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
        int count = 0;
        String[] s = str.split("");
        for(int i = 0; i < str.length(); i++){
            if(s[i].equals("A")) {
                if(i >= str.length()-1) continue;
                count += s[i + 1].equals("C") ? 1 : 0;
                i++;
            }
        }
        return count;
    }
}

