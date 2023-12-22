import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long h = sc.nextLong();
        int n = sc.nextInt();
        long[] arrA = new long[n];
        for(int i = 0; i < n; i++){
            arrA[i] = sc.nextLong();
        }
        long sum = Arrays.stream(arrA).sum();
        if(sum>=h){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
        
        
    }
}