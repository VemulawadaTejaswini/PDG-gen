import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        int[] ans = new int[n];

        for(int i = 0; i <= a[0]*2; i+=2){
            ans[0] = i; 
            for(int j = 0; j < n - 1; j++){
                ans[j + 1] = (a[j] - ans[j] / 2) * 2;
            }

            /*
            for(int k = 0; k < n; k++){
                System.out.print(ans[k] + " ");
            }
            System.out.println();
            */
            
            if((ans[0] / 2 + ans[n - 1] / 2) == a[n - 1]){
                break;
            }
        }

        
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        

    }
}