import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[2][n];
        for(int i=0; i<n; i++){
            a[0][i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            a[1][i] = sc.nextInt();
        }

        //累積メモ配列
        int add_a[][] = new int[2][n];
        add_a[0][0] = a[0][0];
        add_a[1][0] = a[1][0];
        for(int i=1; i<n; i++){
            add_a[0][i] = add_a[0][i-1] + a[0][i];
        }
        for(int i=1; i<n; i++){
            add_a[1][i] = add_a[1][i-1] + a[1][i];
        }

        int max = a[0][0]+ add_a[1][n-1];
        for(int i=1; i<n; i++){
            max = Math.max(max,add_a[0][i] + add_a[1][n-1] - add_a[1][i-1]);
        }
        System.out.println(max);
    }
}
