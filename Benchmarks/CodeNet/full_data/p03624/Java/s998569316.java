import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    int[] inputArray;

    public static void main(String[] args) throws IOException {
        new Main().run();
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        char[] line = sc.next().toCharArray();
        Set<String> set = new HashSet<>();

        String[] ansList = {
                "a",
                "b",
                "c",
                "d",
                "e",
                "f",
                "g",
                "h",
                "i",
                "j",
                "k",
                "l",
                "m",
                "n",
                "o",
                "p",
                "q",
                "r",
                "s",
                "t",
                "u",
                "v",
                "w",
                "x",
                "y",
                "z",
        };

        for(char s: line){
            set.add(String.valueOf(s));
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list);

        String ret = "None";

        for(int i=0; i<list.size(); i++){
            String expected = ansList[i];
            String actual = list.get(i);

            if(!actual.equals(expected)){
                ret = expected;
                break;
            }
        }

        if(ret.equals("None") && list.size() < 26){
            System.out.println(ansList[list.size()]);
        } else {
            System.out.println(ret);
        }

    }

}