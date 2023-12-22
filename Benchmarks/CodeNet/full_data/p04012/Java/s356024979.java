import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Node2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));       
        String str = in.readLine();
        String anser = "Yes";
        if(str.length()%2 != 0){
            anser = "No";
        }else{
            int use[] = new int[26];
            for(int i=0;i<str.length();i++){
                int moji = str.charAt(i);
                use[moji-97]++;
            }
            
            for(int a:use){
                if(a%2 != 0){
                    anser = "No";
                }
            }
        }
        
        System.out.println(anser);
    }
}