import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[sc.nextInt()]++;
        }
        if(n == 1 && a[0] == 1){
            System.out.println(1);
        }else if(n % 2 == 0){
            for(int i = 1; i < n; i+=2){
                if(a[i] != 2){
                    System.out.println(0);
                    return;
                }
            }
            System.out.println(n/2 * n/2);
        }else{
            for(int i = 0; i < n; i+=2){
                if((i == 0 && a[i] != 1) || (i != 0 && a[i] != 2)){
                    System.out.println(0);
                    return;
                }
            }
            System.out.println((n-1)/2 * (n-1)/2);
        }
    }
}
