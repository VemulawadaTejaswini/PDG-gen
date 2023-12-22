import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] a = new int[n];
        int sum = 0;
        int b = 0;
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
            sum += a[i];
        }
        for(int i = 0; i < n; i++){
            if(a[i] >= sum / (4 * m)){
                b++;
            }
        }
        if(b >= m){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}