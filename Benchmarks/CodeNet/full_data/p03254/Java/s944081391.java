import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        long a[] = new long[n];
        
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }
        Arrays.sort(a);
        int count = 0;
        for(int i = 0; i < n; i++){
            if(x >= a[i]){
                x -= a[i];
                count++;
            }else{
                break;
            }
        }
        if(x > 0 && count > 0){
            count--;
        }
        
        System.out.println(count);
    }
}
