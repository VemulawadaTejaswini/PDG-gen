import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n - 1];
        for(int i = 0; i < n - 1; i++){
            a[i] = scan.nextInt() - 1;
        }
        int c = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1; j++){
                if(i == a[j]){
                    c++;
                }
            }
            System.out.println(c);
            c = 0;
        }
    }
}