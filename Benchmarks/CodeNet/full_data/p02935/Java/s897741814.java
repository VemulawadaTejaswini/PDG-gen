import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double[] v = new double[n];
        for(int i = 0; i < n; i++){
            v[i] = sc.nextDouble();
        }
        
        Arrays.sort(v);
        int a = 0;
        while(a < n-1){
            for(int i = a; i < n-1; i++){
                v[i+1] = (v[i] + v[i+1]) / 2;
                a++;
            }
        }
        System.out.println(v[n-1]);
    }
}