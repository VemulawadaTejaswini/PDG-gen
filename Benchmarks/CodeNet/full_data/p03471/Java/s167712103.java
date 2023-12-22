import java.util.*;

public class Main{
    private static void solve(int A, int B){
        int[] b = new int[3];
        for(int x = 0; x <= (B/1000-A)/9; x ++){
            if((B / 1000 - A - 9 * x) % 4 == 0){
                int y = (B / 1000 - A - 9 * x) / 4;
                int z =A - x - y;
                if(y >= 0 && z >= 0){
                    b[0] = x;
                    b[1] = y;
                    b[2] = z;
                    for(int i = 0; i < 3; i ++){
                        System.out.print(b[i] + " ");
                    }
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] a = new int[2];
        for(int i = 0; i < 2; i ++){
            a[i] = input.nextInt();
        }
        input.close();
        int A = a[0];
        int B = a[1];
        solve(A, B);
    }
}