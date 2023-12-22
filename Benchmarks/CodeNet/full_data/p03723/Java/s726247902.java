import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        
        long sum = 0;
        while(A%2==0 && B%2==0 && C%2==0){
            if(A == B && B == C){
                sum = -1;
                break;
            }
            sum++;
            int s = A;
            int t = B;
            int u = C;
            A = (t+u)/2;
            B = (s+u)/2;
            C = (s+t)/2;
        }
        System.out.println(sum);
    }
}