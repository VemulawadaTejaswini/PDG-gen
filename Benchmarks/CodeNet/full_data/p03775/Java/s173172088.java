import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int min = 11;
        long B = 1;
        for(long A = 1;A * A < N;A++){
            if(N % A == 0){
                B = N / A;
            }
            if(digits(A,B) < min){
                min = digits(A,B);
            }
        }
        System.out.println(min);
    }
    public static int digits(long A,long B){
        long max;
        int count = 0;
        if(A < B){
            max = B;
        }
        else{
            max = A;
        }
        while(max != 0){
            max /= 10;
            count++;
        }
        return count;
    }
}
