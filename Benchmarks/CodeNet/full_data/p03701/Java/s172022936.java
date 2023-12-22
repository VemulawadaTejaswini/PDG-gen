import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Main {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        
        List<Long>list = new ArrayList();
        
        for(int i=0; i<n; i++){
            list.add(sc.nextLong());
        }
        
        Collections.sort(list);
        
        long sum = 0;
        
        for (Long ele : list){
            sum += ele;
        }
        
        if(sum % 10 != 0){
            System.out.println(sum);
        } else {
            for (Long ele : list){
                if((sum - ele)%10 !=0){
                    System.out.println(sum - ele);
                    break;
                }
            }
            System.out.println(0);
        }
        
    }
    
}