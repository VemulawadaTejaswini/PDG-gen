import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = stdIn.nextInt();
        }

        int sum = 0;
        int prev = 0;
        for(int i=0; i<n; i++){
            if(i==0){
                sum = 0;
                for(int j=0; j<n; j++){
                    if(j % 2 == 0){
                        sum += a[(i+j) % n];
                    }else{
                        sum -= a[(i+j) % n];
                    }
                }
            }else{
               sum = 2 * a[(n + i - 1) % n] - prev; 
            }

            System.out.print(sum + " ");

            prev = sum;
        }
    }
}
