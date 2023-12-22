import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try{
            String buf = br.readLine();
            String str[] = buf.split(" ", 0);

            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            if(b < a){
		System.out.println(a-1);
	    }   
            else{
		System.out.println(a);
	    }   
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}