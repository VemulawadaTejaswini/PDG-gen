
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] x = new int[n];
        for(int i =0; i<n ; i++){
            x[i] = sc.nextInt();
        }

        int minX = Arrays.stream(x).min().getAsInt();
        int maxX = Arrays.stream(x).max().getAsInt();

        int minValue = 0;
        int[] power = new int[n];
        for(int i = minX; i <= maxX; i++){
            for(int j = 0; j<x.length; j++){
                power[j] = (j-i)*(j-i);    
            }
            minValue = Math.min(minValue, Arrays.stream(power).sum());
        }
        
        System.out.println(minValue);
    }
}