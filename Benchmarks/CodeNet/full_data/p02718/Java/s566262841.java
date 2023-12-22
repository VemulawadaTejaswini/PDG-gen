import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int a[] = new int[N];
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
        }
        
        double sum = 0;
        for (int i=0;i<N;i++){
            sum += a[i];
        } 
        
        int count = 0;
        
        for(int i=0;i>N;i++){
            if(a[i]>=sum/(M*4)){
                count++;
            }
        }
        if(count>=M){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
