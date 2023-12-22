import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] L = new int [N];
        int max = 0;
        int maxnum =0;
        for(int i=0; i<N; i++){
            L[i] = sc.nextInt();
            if(L[i]>max){
                max = L[i];
                maxnum = i;
            }
        }
        
        int sum = 0;
        for(int i=0; i<N; i++){
            if(i == maxnum){
                continue;
            }else{
                sum += L[i];
            }
        }
        
        if(max<sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
