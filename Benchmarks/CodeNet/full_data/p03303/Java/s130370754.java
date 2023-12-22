import java.util.Scanner;
import java.io.*;

public class Main{

     public static void main(String []args){
        
        try{
        Scanner stdIn = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        
        char[] charArray = str.toCharArray();
        
        int b = stdIn.nextInt();
        
        int i = 0;
        for (char ch : charArray) {
            
            if(i % b == 0)
	            System.out.print(ch);
	        i++;
        }
        }catch(IOException e){
             System.out.println("Exception :" + e);
        }
        
     }
}