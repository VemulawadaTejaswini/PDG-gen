import java.util.*;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int count = scanner.nextInt();
        int sum = scanner.nextInt()/1000;
        int ten_thou = 10;
        int five_thou = 5;
        int thou = 1;
        int z = 0;
        boolean lie = true;
        
        
        for(int x=0;x<=sum/10;x++){
            if(sum % ten_thou == 0 && sum/ten_thou==count){
                System.out.print(count+" 0 0");
                lie = false;
                break;
            }else{
            for(int y=0;y<=sum/5;y++){
                z = sum - (ten_thou*x + five_thou*y);
                    if( x+y+z == count){
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