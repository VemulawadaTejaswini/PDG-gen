import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int sum = 0;
        int[] sumcon = new int[201];
        for(int i = -100; i <= 100; i++){
            for(int j = 0; j < n; j++){
                sum = sum + (i - a[j])*(i - a[j]);
            }
            sumcon[i+100] = sum;
            sum = 0;
        }
        Arrays.sort(sumcon);
        System.out.print(sumcon[0]);
    }
}