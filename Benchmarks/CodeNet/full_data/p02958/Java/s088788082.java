import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] t = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
            t[i] = p[i];
        }

        Arrays.sort(p);
        int count = 0;
        for(int i = 0; i < n; i++){
            if(p[i] != t[i]){
                count++;
            }
        }
        
        if(count <= 2){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
    }
}