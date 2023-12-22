import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for(int i = 0 ; i < n ; i++ ){
            p[i] = sc.nextInt();
        }
        int s = 0;
        for(int i = 0 ; i < n ; i++ ){
            int cou = 0;
            for(int j = 0 ; j < i && cou == 0 ; j++ ){
                if(p[j] < p[i]){
                    cou++;
                    s++;
                }
            }
        }
        System.out.println(n - s);
        sc.close();
    }
}