import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int x[] = new int[num];
        int p = 0;
        for(int i = 0; i<num; i++){
            x[i] = sc.nextInt();
            p = p + x[i];
        }
        int ans1 = 0;
        int ans2 = 0;
        int ans = 0;
        p = p / num;
        
        for(int i = 0; i<num; i++){
            ans1 = ans1 + (x[i] - p) * (x[i] - p);
        }
        
        p++;
        
        for(int i = 0; i<num; i++){
            ans2 = ans2 + (x[i] - p) * (x[i] - p);
        }
        
        if(ans1 < ans2){
            ans = ans1;
        }else{
            ans = ans2;
        }
        
        System.out.println(ans);
    }
}