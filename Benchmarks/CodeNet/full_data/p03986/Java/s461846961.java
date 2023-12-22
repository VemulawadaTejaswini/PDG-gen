import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int prelen = line.length();
        int len = 0;
        Pattern regex = Pattern.compile("ST");
        String result = regex.matcher(line).replaceFirst("");
        while (prelen - len > 0){
            result = regex.matcher(result).replaceFirst("");
            //System.out.println(result);
            prelen = len;
            len = result.length();
        }
        if (result.equals("ST")){
            result = "";
        }
        System.out.println(result.length());
    }
}
