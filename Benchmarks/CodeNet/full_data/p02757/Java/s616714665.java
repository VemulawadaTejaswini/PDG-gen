import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int ln = Integer.parseInt(sc.next());
        int P = Integer.parseInt(sc.next());
        String s = sc.next();
        int[] nums = new int[ln];
        for(int i=0; i<ln; i++){
            nums[i] = s.charAt(i)-48;
        }
        
        int count=0;
        int memo = 0;
        for(int i=0; i<ln; i++){
            memo=nums[i];
            memo%=P;
            if(memo%P==0) count++;
            for(int j=i+1; j<ln; j++){
                memo*=10;
                memo+=nums[j];
                memo%=P;
                if(memo==0) count++;
            }
        }
        System.out.println(count);
    }
}