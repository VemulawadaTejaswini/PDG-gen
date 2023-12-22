import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer n = scan.nextInt();
        Long a[] = new Long[n];
        
        for(int i=0;i<n;i++){
            long l = scan.nextLong();
            a[i] = l;
        }

        Arrays.sort(a);

        int cnt=0;
        while(a[cnt] < (a[n-1]/2)) cnt++;

        double min=100000;
        int p = 0;
        for(int i=0;i<n-1;i++){
            if(Math.abs(a[i]-(a[n-1]/2.0)) < min){
                min = Math.abs(a[i]-(a[n-1]/2.0));
                p = i;
            }
        }
        System.out.println(a[n-1] + " " + a[p]);
    }

    static int factorial(int n){
        if(n == 0){
          return 1;
        }
        return n * factorial(n-1);
    }


}