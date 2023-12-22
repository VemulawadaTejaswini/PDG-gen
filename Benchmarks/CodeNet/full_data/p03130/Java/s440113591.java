import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int[] x = new int[4];
        for(int i=0;i<4;i++){
            x[i] =0;
        }
        for(int i=0;i<6;i++){
            int n= sc.nextInt();
            x[n-1]++;
            if(x[n-1] >2){
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");

    }
}