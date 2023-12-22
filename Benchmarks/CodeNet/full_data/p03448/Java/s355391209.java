import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = null;
        PrintWriter writer = null;
        
        try {
            reader =new BufferedReader(new InputStreamReader(System.in));
            writer = new PrintWriter(System.out);
            
            int patern = 0;
            
            int amount500 = Integer.parseInt(reader.readLine()),
                amount100 = Integer.parseInt(reader.readLine()),
                amount50 = Integer.parseInt(reader.readLine()),
                amountX = Integer.parseInt(reader.readLine());
            
            for(int a = 0; a <= amount500; a ++){
                for(int b = 0; b <= amount100; b++){
                    for(int c = 0; c<= amount50; c++){
                        if(a * 500 + b * 100 + c * 50 == amountX) patern++;
                    }
                }
            }
            
            writer.println(patern);
            
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