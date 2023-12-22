import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] out = new int[n];
        for(int i = 1; i <= n; i++){
            for(int j = i + 1; j <= n; j++){
                out[Math.min(j - i, Math.abs(x - i) + 1 + Math.abs(y - j))]++;
            }
        }
        for(int i = 1; i <= n - 1; i++) System.out.println(out[i]);
    }
}