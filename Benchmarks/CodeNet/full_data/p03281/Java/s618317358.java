import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int N = Integer.parseInt(br.readLine());
            int result = 0;
            for(int i=1; i<=N; i=i+2){
                int count = 0;
                
                for(int j=1; j<=i; j++){
                    if(i%j == 0){
                        count++;
                    }
                }
                
                if(count == 8){
                    result++;
                    //System.out.println(i);
                }
            }
            
            System.out.println(result);
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}