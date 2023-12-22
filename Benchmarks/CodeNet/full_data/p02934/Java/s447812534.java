import java.util.Scanner;
public class Main { 
    public static void main(String[] args) { 
	Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double[]a = new double[n];
        double reci = 0;
        for(int i = 0; i < n; i++){
            a[i] = scn.nextDouble();
            reci += (1/a[i]);
        }
        System.out.println(1/reci);
    }
} 
