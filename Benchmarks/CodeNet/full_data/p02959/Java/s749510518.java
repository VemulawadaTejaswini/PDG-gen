import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        long a[] = new long[n+1];
        long b[] = new long[n];
        for(int i = 0;i < n+1;i++) {
            a[i] = stdIn.nextLong();
        }
        for(int i = 0;i < n;i++){
            b[i] = stdIn.nextLong();
        }
        long count = 0;
        for(int i = 0;i < n;i++) {
            if(a[i] < b[i]){
                count += a[i];
                b[i] -= a[i];
                if(a[i+1] >= b[i]) {
                    count += b[i];
                    a[i+1] -= b[i];
                }else{ 
                    count += a[i+1];
                    a[i+1] = 0;
                }
            }else {
                count += b[i];
            }
        }
        System.out.println(count);
    }
}