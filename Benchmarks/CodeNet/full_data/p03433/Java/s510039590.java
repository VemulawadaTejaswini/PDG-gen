import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        PrintWriter writer = null;
        
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            writer = new PrintWriter(System.out);
            
            int N = Integer.parseInt(br.readLine());
            int A = Integer.parseInt(br.readLine());
            
            if(N%500 <= A) writer.println("Yes");
            else writer.print("No");
            
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