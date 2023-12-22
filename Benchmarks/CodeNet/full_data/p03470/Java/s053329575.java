import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	
	public static void main(String[] args) throws Exception {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        int n = Integer.parseInt(str);
        String box[] = new String[n];
        for(int i = 0;i<n;i++){
        	box[i] = br.readLine();
        }
        Arrays.sort(box);
        for(int i = 0;i<n;i++){
   		// System.out.println(box[i]);
        }
       
         int boxnum = box.length;
         
         for(int i=0;i<box.length-1;i++){
    	//	 System.out.println("Hello");
    	//	 System.out.println("Heey" + box[i] + box[i+1]);
        	 if(box[i].equals(box[i+1])){
        		 boxnum--;
        	//	 System.out.println("Hi,I'm" + i);
        	 }	 
         }
        System.out.println(boxnum);
        
        
}
}
