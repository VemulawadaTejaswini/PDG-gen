import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
public class Main {
	public static void main(String args[]){
    	InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
      	
      	String xyz = null;
      	xyz ＝ br.readLine();
      	String[] str = xyz.split(" ", 0);

      	System.out.println(str[2]+" "+str[0]+" "+str[1]);
      
	}
}