import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int w = scan.nextInt();
        int n = scan.nextInt();
        int a =Math.max(h,w);
        int b =Math.min(h,w);
        for(int i=0;i<=b;i++){
            if(a*i>=n){
                System.out.println(i);
                break;
            }
        }
    }
}