import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();
        int [] a = new int[N];
        
        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
        }
    
        for(int i=0; i<N-1; i++){
            for(int j=0; j<N-1-i; j++){
                if(a[j]<a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
            
        int count =0;
        for(int i=0; i<N; i++){
            if(i == N-1){
            count++;                
            }
            if(x-a[i]>=0){
                count++;
                x = x-a[i];
            }
            else{
                break;
            }
        }
        
        System.out.println(count);
    }
}