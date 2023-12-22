import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
 static void main(String[] args) throws Exception{
	       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       int N = Integer.parseInt(br.readLine());
	       int[] line = new int[N];
	       int sum = 0;
	       for(int i=0;i<N;i++){
	    	   line[i]=Integer.parseInt(br.readLine());
	    	   sum+=line[i];
	       }
	       Arrays.sort(line);
	       if(sum%10==0){
	    	   for(int i=0;i<N;i++){
	    		   if((sum-line[i])%10!=0){
	    			   sum-=line[i];
	    			   break;
	    		   }else{
	    			   sum+=line[i];
	    		   }
	    		   if(i==N-1){
	    			   sum=0;
	    		   }
	    	   }
	       }
	       System.out.println(sum);
	}
}
