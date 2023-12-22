import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) throws Exception{    
        Scanner sc = new Scanner(System.in);
        // code
       
        String s = sc.next();
        
        boolean f = false;
        int n = s.length();
        int i;
        for(i=0; i<n-7;){
        	if(s.substring(i, i+5).equals("dream")){
        		if(s.substring(i+6, i+8).equals("era")){
        			i += 5;
        		}else if(s.substring(i+6, i+7).equals("er")){
        			i += 7;
        		}else{
        			i += 5;
        		}
        	}else if(s.substring(i, i+5).equals("erase")){
        		if(s.substring(i+5, i+7).equals("era")){
        			i += 5;
        		}else if(s.substring(i+5, i+6).equals("er")){
        			i += 7;
        		}else{
        			i += 5;
        		}
        	}else{
        		f = true;
        		break;
        	}
        }
        
        if(n - i == 5){
        	if(s.substring(i, i+5).equals("dream")) f = false;
        	if(s.substring(i, i+5).equals("erase")) f = false;
        }else if(n - i == 6){
        	if(s.substring(i, i+6).equals("eraser")) f = false;
        }else if(n - i == 7){
        	if(s.substring(i, i+7).equals("dreamer")) f = false;
        }else{
        	f = true;
        }
        
        
        
        
        
        if(f == true){
        	System.out.println("NO");
        }else{
        	System.out.println("YES");
        }
        
        sc.close();
    }
    
    
    
    
 
}