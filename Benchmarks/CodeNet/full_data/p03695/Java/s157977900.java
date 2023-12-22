import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] col = new int[9];
        for(int i = 0;i < N;i++){
            int a = sc.nextInt();
            if(a/400 <= 7)  col[a/400]++;
            else    col[8]++;
        }
        int m1 = 0;
        int m2 = 0;
        for(int i = 0;i < 8;i++){
            if(col[i] > 0){
                m1++;
                m2++;
            }
        }
        if(col[8] > 0){
            if(m1 == 0) m1 = 1;
            m2 += col[8];
        }
        System.out.println(m1+" "+m2);
    }
}