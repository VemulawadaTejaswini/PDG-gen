import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        int a[] = new int[n + 1]; //モンスター数
        int b[] = new int[n]; //勇者が倒せる数
        int count = 0;
        
        for(int i = 0; i < n + 1; i++){
            a[i] = stdIn.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            b[i] = stdIn.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            if(i < n - 1){
                if(b[i] - a[i] > 0){
                    count += a[i];
                    b[i + 1] += b[i] - a[i];
                }else{
                    count += b[i];
                }
            }else{
                if(b[i] - a[i] - a[i + 1] > 0){
                    count += a[i] + a[i + 1];
                    
                }else{
                    count += b[i];
                }
            }
            
            //System.out.println(count);
        }
        
        System.out.println(count);

    }
}
