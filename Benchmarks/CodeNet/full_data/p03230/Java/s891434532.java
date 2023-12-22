import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
	boolean flag = false;
        int k = 2;
        for(int i = 2; i * (i - 1) <= n * 2; i++){
            if(i * (i-1) == n * 2){
                k = i;
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("No");
            return;
        }
        else{
            System.out.println("Yes");
            int[][] s = new int[k][k-1];
            int cnt = 0;
            for(int i = 0; i < k-1; i++){
                for(int j = 0; j < k - 1 - i; j++){
                    s[i][j] = ++cnt;
                    s[k - 1 - j][k-2-i] = cnt;
                }
            }
            for(int i = 0; i < k; i++){
                System.out.print(k-1);
                for(int j= 0; j < k-1; j++){
                    System.out.print(" " + s[i][j]);
                }
                System.out.println("");
            }
        }
    }
}