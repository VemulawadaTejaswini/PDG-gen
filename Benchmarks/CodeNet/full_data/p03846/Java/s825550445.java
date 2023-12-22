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
        int c = 1;
        if (n % 2 == 0){
            while (true){
                int num = n - c;
                if (num < 0){
                    break;
                }
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
                c += 2;
            }
            
            if (res) {
                resCount = (int)Math.pow(2,n/2);
            }
            
        }else{
            int zeroCount = 0;
            
           while (true){
               int num = n - c;
               if (num < 0){
                   break;
               }
               int count = 0;
                for (int j=0; j<n; j++){
                    if (a[j] == num){
                        if (num == 0){
                            zeroCount++;
                        }else{
                            count++; 
                        }
                        
                    }
                }
                if (zeroCount ==0 &&count != 2){
                    res = false;
                    break;
                }
                c += 2;
           }
           
            if (zeroCount != 1){
                res = false;
            }
            if (res) {
                resCount = (int)Math.pow(2,n/2);
            }
            
        }
        
       resCount %= 1000000000+7;
        System.out.println(resCount);
        
    }

}
