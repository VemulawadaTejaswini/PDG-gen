import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        boolean res = true;
        int resCount = 0;
        if (n % 2 == 0){
            for (int i=0; i<n; i++){
                int num = n - a[i];
                int count = 0;
                for (int j=0; j<n; j++){
                    if (a[j] == num){
                        count++;
                    }
                }
                if (count != 2){
                    res = false;
                    break;
                }
            }
            
            if (res) {
                resCount = (int)Math.pow(2,n/2);
            }
            
        }else{
            for (int i=0; i<n; i++){
                int zeroCount = 0;
                int num = n - a[i];
                int count = 0;
                for (int j=0; j<n; j++){
                    if (a[j] == 0){
                       zeroCount++; 
                    }else if (a[j] == num){
                        count++;
                    }
                }
                
                if (zeroCount != 1 || count != 2){
                    res = false;
                    break;
                }
            }
            
            if (res) {
                resCount = (int)Math.pow(2,n/2);
            }
            
        }
        
       resCount %= 1000000000+7;
        System.out.println(resCount);
        
    }

}
