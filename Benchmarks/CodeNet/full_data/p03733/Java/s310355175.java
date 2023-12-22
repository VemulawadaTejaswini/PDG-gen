import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int T =sc.nextInt();
        
        int time[] =new int[N];
        for(int i=0;i<N;i++){
            time[i] =sc.nextInt();
        }
        int count=T;
        
        for(int i=0;i<N;i++){
            if(time[i]<T){
                count+=T-(T-time[i]);
            }else{
                count+=T;
            }
        }
        
        System.out.println(count);
        
    }       
    
        
}
