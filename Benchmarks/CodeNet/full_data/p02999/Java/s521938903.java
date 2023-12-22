
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);        
        int n = stdIn.nextInt();
        long k = stdIn.nextLong();
        int[] a = new int [n];
        for(int i = 0; i < n ; i++)
            a[i] = stdIn.nextInt();
        long count = 0;
        long sum = 0;
        int i = 0; int j = 0;
        for(; i < n; i++){
            for(; j < n && sum < k; j++){
               sum += a[j];
            }
               if(sum < k) break;
                   count += n - j + 1;  //for文を出るときに値が1増えたので(n-1)-(j-2)=n-j+1
                   sum -= a[i];
        }  
        System.out.println(count);
    }
}