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
            
            int query = Integer.parseInt(reader.readLine());
            String readLine;
            
            List<Integer> sosu = new ArrayList<>();
            for(int i = 2; i <= 100000; i++){
                sosu.add(i);
            }
            for(int j = 0; j < sosu.size(); j++){
                for(int x = j + 1; x < sosu.size(); x++){
                    if(sosu.get(x) % sosu.get(j) == 0){ 
                        sosu.remove(x);
                    }
                }
            }
            
            while((readLine = reader.readLine()) != null){
                int ans = 0;
                String[] splitLine = readLine.split(" ");
                int start = Integer.parseInt(splitLine[0]), 
                    end = Integer.parseInt(splitLine[1]);
                
                
                for(int i = start; i <= end ; i += 2){
                    int likeNumber = (i + 1) / 2;
                    boolean IsItSosu = i > 2;
                    
                    if(sosu.indexOf(i) == -1){
                        IsItSosu = false;
                    }
                    if(sosu.indexOf(likeNumber) == -1){
                        IsItSosu = false;
                    }
                    
                    
                    if(IsItSosu){   ans ++; }

                }

                writer.println(ans);
                
            }
            
            
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