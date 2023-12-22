import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        Set<String> riceCakeSize = new HashSet<>(); 
        
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < num; i++){  riceCakeSize.add(br.readLine());  }
        writer.println(riceCakeSize.size());
        
        br.close();
        writer.close();
    }
}