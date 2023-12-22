import java.util.Scanner;
 
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long result = 0;
        result = (N / (A+B)) * A;
        long temp = 0;
        temp = N % (A+B);
        result+= Math.min(temp, A);
        System.out.println(result);
    }
}