import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int blockStart = Integer.parseInt(line[1]);
        int blockEnd   = Integer.parseInt(line[2]);
        int attend = 0;
        for(int n=0;n<N;n++){
        	int classTime = Integer.parseInt(br.readLine());
        	if(classTime<blockStart || classTime>=blockEnd) attend++;
        }
        
        System.out.println(attend);
    }
}