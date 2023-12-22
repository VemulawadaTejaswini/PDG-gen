import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count;
        int ans=Integer.MAX_VALUE;
        int tmp;
        for(int i=0;i<n;i++){
            tmp=sc.nextInt();
            count=0;
            while(tmp%2==0){
                count++;
                tmp/=2;
            }
            ans=Math.min(ans, count);
        }
        System.out.println(ans);
    }

    
}