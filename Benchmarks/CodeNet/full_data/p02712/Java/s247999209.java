import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        
        long ans=0L;
        
        for(int i=0;i<=N;i++){
            if(i%3==0||i%5==0){
                
            }else{
                ans+=i;
            }
        }
        
        System.out.println(ans);
    }
}
