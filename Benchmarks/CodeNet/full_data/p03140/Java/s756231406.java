import java.io.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.List;
 
public class Main{
 
     public static void main(String[] args){
        
        try{
        Scanner scan = new Scanner(System.in);
        
        List<String> inputs = new ArrayList<String>();
        
        while(scan.hasNextLine()){
            
            inputs.add(scan.next());
            
        }
            //格納(N A B C)
            int n = Integer.parseInt(inputs.get(0));
            String a = inputs.get(1);
            String b = inputs.get(2);
            String c = inputs.get(3);
            
            int count = 0;
            
            for(int i = 0; i < n; i++){
                
            String ta =String.valueOf(a.charAt(i));
            String tb = String.valueOf(b.charAt(i));
            String tc = String.valueOf(c.charAt(i));

            boolean ab = ta.equals(tb);
            boolean bc = tb.equals(tc);
            boolean ca = tc.equals(ta);
            
            if(!ab && !bc && !ca){
                
                count = count + 2;
                        
            }else if(ab && bc && ca){
        
                count = count;
            
            }else{
                count = count + 1;
            }
            
            }
            System.out.println(count);
            
        
         }catch(Exception e){
        
           System.out.println(e); 
           
         }
     }
}