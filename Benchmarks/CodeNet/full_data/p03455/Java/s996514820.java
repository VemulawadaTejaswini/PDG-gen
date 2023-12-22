import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        
        String[] line = reader.readLine().split(" ");
        int a = Integer.parseInt(line[0]),
            b = Integer.parseInt(line[1]);
        
        if( a % 2 == 0 || b % 2 == 0){ writer.println("Even");
        }else{ writer.println("Odd");}
        
        reader.close();
        writer.close();
    }
}