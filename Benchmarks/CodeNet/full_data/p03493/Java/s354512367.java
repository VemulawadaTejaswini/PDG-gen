import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        int [] ans = new int[0];
        
        ans[0] = sc.nextInt();
        
        int cnt = 0;

        for (int num : ans){
            
            if (num == 1){
                
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
       
}