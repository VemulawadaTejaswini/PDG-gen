import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = null;
        PrintWriter writer = null;
        
        try {
            reader =new BufferedReader(new InputStreamReader(System.in));
            writer = new PrintWriter(System.out);
            
            writer.println((Integer.parseInt(reader.readLine()) - Integer.parseInt(reader.readLine())) % Integer.parseInt(reader.readLine()));
            
            
        }finally{
            if(reader != null){
                reader.close();
            }
            if(writer != null){
                writer.close();
            }
        }

    }
}