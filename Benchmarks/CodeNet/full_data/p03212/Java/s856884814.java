import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
	public static void main (String args[])  throws IOException {

    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String input = br.readLine();
    	int result = 0;

    	if(Integer.parseInt(input) >= 357){
    		for(int i = 357; i <= Integer.parseInt(input); i++){
    			String s = Integer.toString(i);
    			if(
    				s.indexOf("3") != -1 && s.indexOf("5") != -1 && s.indexOf("7") != -1 &&
    				s.indexOf("0") == -1 && s.indexOf("1") == -1 && s.indexOf("2") == -1 && 
    				s.indexOf("4") == -1 && s.indexOf("6") == -1 && s.indexOf("8") == -1 && s.indexOf("9") == -1
    				)
    			{
    				result++;
    			}
    		}	
   		 }
   		 System.out.println(Integer.toString(result));
	}
}