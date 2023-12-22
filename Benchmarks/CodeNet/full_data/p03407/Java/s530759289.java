import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        PrintWriter writer = null;
        
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            writer = new PrintWriter(System.out);
            
            String[] inputCoinNum = br.readLine().split(" ");
            int A = Integer.parseInt(inputCoinNum[0]),
                B = Integer.parseInt(inputCoinNum[1]),
                C = Integer.parseInt(inputCoinNum[2]);
            
            writer.println(A + B >= C ? "Yes" : "No");
        }finally{
            if(br != null){
                br.close();
            }
            if(writer != null){
                writer.close();
            }
        }

    }
}