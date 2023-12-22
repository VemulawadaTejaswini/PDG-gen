import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int a = 2;
        int b=2;
        int c=2;
        int x=100;
        int num = 0;
        int ans = 0;
        
        for(int ia=0; ia<=a; ia++){
            for(int ib=0; ib<=b; ib++){
                for(int ic=0; ic<=c; ic++){
                    num = 500*ia+100*ib+50*ic;
                    if(num==x){
                        ans++;
                    }
                }
            }
        }
        
        System.out.println(ans);
    }
}
