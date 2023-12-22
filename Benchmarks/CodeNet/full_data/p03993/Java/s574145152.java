import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int [] RABBIT = new int[N];
        for(int i=0;i<RABBIT.length;i++){
            RABBIT[i]=Integer.parseInt(st.nextToken());
        }
        
        int [] RABBITLIKE = new int [N];
        for(int k=0;k<RABBITLIKE.length;k++){
            if(RABBITLIKE[RABBIT[k]-1]==0 && k+1 < RABBIT[k])
                RABBITLIKE[RABBIT[k]-1] = k+1;
        }
        
        int count =0;
        for(int i=0;i<RABBIT.length;i++){
            if(RABBIT[i]==RABBITLIKE[i]){
                count++;
            }
        }
        
        pr.println(count);
        pr.close();
        
    }
    
}
