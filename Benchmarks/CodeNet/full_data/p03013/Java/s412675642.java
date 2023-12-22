import java.util.*;

public class Main {


    public static int fibo(long num){
        if (num==-1){
            return 0;
        }
        if (num==0) {
            return 1;
        }
        if (num==1) {
            return 1;
        }
        return fibo(num-1) + fibo(num-2);
    }

    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        int m = sc.nextInt();
        int a[] = new int[m];

        long sum = 1;

        for (int i=0; i<m; i++){
            a[i] = sc.nextInt();
        }

        int multi[] = new int[m+1];

        multi[0] = fibo(a[0]-1)%1000000007;
        multi[m] = fibo(n-a[m-1]-1)%1000000007;

        for (int j=1; j<m; j++){
            multi[j] = fibo(a[j]-a[j-1]-2)%1000000007;
        }

        for (int k=0; k<m+1; k++) {
            sum = sum*multi[k];
        }

        System.out.print(sum % 1000000007);

    }
    }



