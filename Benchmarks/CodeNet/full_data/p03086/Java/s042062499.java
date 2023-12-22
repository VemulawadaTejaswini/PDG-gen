
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by bi16060 on 2019/03/24.
 */
public class Main{
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split("");
        System.out.println("length =" + line.length);

        int max_length = 0;
        int length = 0;

        for(String s : line) {
            switch (s) {
                case ("A"):
                case ("T"):
                case ("C"):
                case ("G"):
                    length+=1;
                    break;
                default:
                    if (length > max_length){
                        max_length = length;
                    }
                    length = 0;
                    break;
            }
        }
        if (length > max_length){
            max_length = length;
        }
        System.out.println(max_length);
    }
}

