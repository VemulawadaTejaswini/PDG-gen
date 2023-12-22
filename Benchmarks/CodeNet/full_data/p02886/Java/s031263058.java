import java.util.*;


public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] d = new int[n];
        for(int i = 0; i < n; i++) d[i] = scan.nextInt();
        int out = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                out += d[i] * d[j];
            }
        }
        System.out.println(out);
        scan.close();
    }
}