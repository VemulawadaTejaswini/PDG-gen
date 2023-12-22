
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String line = br.readLine();
		Scanner scan = new Scanner(System.in);

	    String a = scan.next();
	    String[] b = a.split("");
	    int c = 300000;
	    int d = 300000;

	    for(int i=0;i<b.length;i++)
	    	if(b[i].equals("A")){
	    		c = i;
	    	break;
	    	}
	    	else
	    		continue;
	    
	    	for(int j=b.length-1;j>=0;j--)
		    	if(b[j].equals("Z")){
		    		d = j;
	    	break;}
		    	else
		    		continue;
		   
	    	
	    		d = d-c+1;
	    		System.out.println(d);
	    	
	    	
	    		
	    		
	    	
	    	
	    }
	    	

	}

