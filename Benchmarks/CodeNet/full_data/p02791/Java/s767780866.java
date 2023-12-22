import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++) p[i] = scan.nextInt();
        int out = n;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                if(p[i] > p[j]){
                    out--;
                    break;
                }
            }
        }
        System.out.println(out);
        scan.close();
    }
}