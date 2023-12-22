import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        int least=Integer.MAX_VALUE;
        int tmp;
        for(int i=0;i<n;i++){
            tmp=sc.nextInt();
            sum+=tmp;
            if(tmp%10!=0){
                least=Math.min(least, tmp);
            }
        }
        System.out.println(sum%10==0?Math.max(0, sum-least):sum);
    }
}