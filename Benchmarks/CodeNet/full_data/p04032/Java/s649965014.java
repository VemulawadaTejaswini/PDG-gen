import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
	public static void main( String[] args ) throws IOException
    {
        BufferedReader br = new BufferedReader(
                                new InputStreamReader( System.in ) );
        String str = br.readLine();
        int a = -1;
        int b = -1;
        char c[] = str.toCharArray();
        for(int i = 2; i < c.length; i++){
        	if(c[i] == c[i-1]){
        		a = i;
        		b = i+1;
        		break;
        	} else if(c[i] == c[i-2]){
        		a = i-1;
        		b = i+1;
        		break;
        	}
        }
        System.out.println(a+" "+b);
	}
}