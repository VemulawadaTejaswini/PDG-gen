import java.util.Scanner;

/**
 * Created by mizuk on 2017/07/26.
 */
public class Main {

    private static int x;   //前者の和
    private static int y;   //後者の和
    private static int N;
    private static int a[];
    private static int ans = 1000000000;

    public static void sum(int index){
        x += a[index];
        y -= a[index];
    }

    public static void input(){
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
        a = new int[N];

        for(int i=0;i<N;i++) {
            a[i] = scan.nextInt();
        }
    }

    public static void main(String args[]){
        input();

        //x,y初期値
        x += a[0];
        for(int i=1;i<N;i++){
            y += a[i];
        }

        for(int index=1;index<N;index++){
            if(Math.abs(x-y) < ans){
                ans = Math.abs(x-y);
            }
            sum(index);
        }

        System.out.println(ans);
    }
}
