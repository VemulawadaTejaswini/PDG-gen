import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        
        String[] dic = {"dreamer","dream","eraser","erase"};
        boolean checked;
        
        
        do{
            checked = false;
            for(String ite : dic){
                if(s.endsWith(ite)){
                    
                
                    s = s.substring(0,s.length() - ite.length());
                    checked = true;
                }
                
            }
        }while(checked);
        if(s.length() == 0){
            System.out.println("YES");
        }else{
            
            System.out.println("NO");
        }
            
    }
}
