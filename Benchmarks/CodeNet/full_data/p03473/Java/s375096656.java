import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException{
        Scanner reader = null;
        PrintWriter writer = null;
        
        try {
            reader =new Scanner(System.in);
            writer = new PrintWriter(System.out);
            
            writer.println(48 - reader.nextInt());
            
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