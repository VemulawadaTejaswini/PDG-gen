import java.io.BufferedReader;
import java.io.InputStreamReader;


public class main {

	public static void main(String[] args) throws Exception {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String line2 = br.readLine();
        
        String boxx[] = line.split("");
        
        
        
        int n = boxx.length;
        int k = Integer.parseInt(line2);
        String ans =("");
        
        for(int i=0;i<n;i++){
        //    System.out.println(i);
        	if((i-1)%k == 0){
        		ans+=boxx[i];
        	}
        	
        	
        }
        System.out.println(ans);
	}

}
