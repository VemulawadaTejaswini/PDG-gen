import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();
        int x=0 , y=0, min=99999999;
        for(int i=1; i<=N; i++){
            y=(L+i-1);
            y=Math.abs(y);
            if(min>y){
                min = y;
            }
            x = x+(L+i-1);
        }
        x = x-min;
        System.out.println(x);
    }
}