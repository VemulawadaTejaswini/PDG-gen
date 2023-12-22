import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) {
 
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
 
        String str = null;
        String num = null;
        String str2 = null;
        try {
            str = br.readLine();
            num = br.readLine();
            str2 = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
      String[] strArray = str.split(" "); 
 
    }
 
}