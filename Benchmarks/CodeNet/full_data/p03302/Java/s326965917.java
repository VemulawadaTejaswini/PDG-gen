import java.io.BufferedReader;
import java.io.InputStreamReader;


public class main {

	public static void main(String[] args) throws Exception {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        
        String boxx[] = line.split(" ");
        
        
        int n = Integer.parseInt(boxx[0]);   //n
        int k = Integer.parseInt(boxx[1]); 
		
        
        
        if(n+k==15){
        	System.out.println("+");
        }else if(n*k ==15){
        	System.out.println("*");
        }else{
        	System.out.println("x");
        }
        
	}

}
