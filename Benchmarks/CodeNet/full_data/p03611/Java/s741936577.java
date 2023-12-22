import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for(int i = 0;i < N;i++){
            a[i] = sc.nextInt();
        }
        int x;
        int max = 0;
        for(int j = 0;j < N;j++){
            x = a[j];
            int count = 0;
            for(int i = 0;i < N;i++){
                if(a[i] == x || a[i] == x-1 || a[i] == x+1){
                    count++;
                }
            }
            max = Math.max(max,count);
        }
        System.out.println(max);
    }
}
