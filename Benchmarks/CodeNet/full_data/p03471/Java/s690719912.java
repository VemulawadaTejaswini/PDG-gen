import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int count = scanner.nextInt();
        int sum = scanner.nextInt();
        int ten_thou = 10000;
        int five_thou = 5000;
        int thou = 1000;
        int z = 0;
        boolean lie = true;
        
        
        for(int x=0;x<=sum/10000;x++){
            if(sum % ten_thou == 0 && sum/ten_thou==count){
                System.out.print(count+" 0 0");
                lie = false;
                break;
            }else{
            for(int y=0;y<=sum/5000;y++){
                z = count - (x+y);
                        if((10000*x + 5000*y + 1000*z) == sum && x+y+z==count){
                            
                           System.out.print(x+" "+y+" "+z);
                           lie = false;
                            break;
                        }
                    
            }
                }
                
                if(lie)System.out.print("-1 -1 -1");
                
                
                
                break;
            }
            
        }
        
        
}