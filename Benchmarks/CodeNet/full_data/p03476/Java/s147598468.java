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
            reader =new Scanner(new BufferedReader(new InputStreamReader(System.in)));
            writer = new PrintWriter(System.out);
            
            int query = reader.nextInt();
            
            while(reader.hasNext()){
                if(reader.hasNextInt()){
                    int ans = 0;
                    int start = reader.nextInt(), end = reader.nextInt();
                    
                    for(int i = start; i <= end; i += 2){
                        int likeNumber = (i + 1) / 2;
                        boolean IsItSosu = i > 2;
                        for(int x = 2; x < i; x++){
                            if(i % x == 0){
                                IsItSosu = false;
                                break;
                            }
                        }
                        if(IsItSosu){
                            for(int x = 2; x < likeNumber; x++){
                                if(likeNumber % x == 0){
                                        IsItSosu = false;
                                        break;
                                    }
                            }
                        
                        }
                        if(IsItSosu){   ans ++; }
                        
                    }
                    
                    writer.println(ans);
                }else{
                    reader.next();
                }
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