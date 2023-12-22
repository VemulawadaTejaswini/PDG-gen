import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = scan.nextInt();
        }
        int c = 0;
        for(int i = 0; i < n; i++){
            if(p[i] != i + 1){
                c++;
            }
        }
        if(c == 2 || c == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}