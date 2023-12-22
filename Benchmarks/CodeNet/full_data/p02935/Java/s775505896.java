import java.util.Arrays;
import java.util.Scanner;
public class Main { 
    public static void main(String[] args) { 
	Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double[]a = new double[n];
        for(int i = 0; i < n; i++){
            a[i] = scn.nextDouble();
        }
        Arrays.sort(a);
        double max = 0l;
        for(int i = 0; i < n-1; i++){
            a[i+1] = (a[i]+a[i+1])/2;
            max = a[i+1];
        }
        System.out.println(max);
    }
} 
