import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
            
        Scanner sc =new Scanner(System.in);
    
        int n = sc.nextInt();
        double sum = 0;
        int[] lst = new int[n];
    
        for(int i=0;i<n;i++){
            lst[i] = sc.nextInt();
            sum+=lst[i];
        }
        
        int ans = 0;double min = 0;
        sum /= n;
        for(int i=0;i<n;i++){
            if(i==0){min=Math.abs(lst[i]-sum);continue;}
            if(min>Math.abs(lst[i]-sum)){
                min=Math.abs(lst[i]-sum);
                ans=i;
            }
        }
        System.out.println(ans);
    }
}