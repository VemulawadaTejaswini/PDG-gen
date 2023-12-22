import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        int max = 0;
        for(int i = 0; i < n; i++){
            if(max <= a[i]){
                max = a[i];
            }
        }
        int max2 = 0;
        int c = 0;
        for(int i = 0; i < n; i++){
            if(max2 < a[i] && a[i] != max){
                max2 = a[i];
            }
            if(a[i] == max){
                c++;
            }
        }
        for(int i = 0; i < n; i++){
            if(a[i] == max && c < 2){
                System.out.println(max2);
            }else{
                System.out.println(max);
            }
        }
    }
}