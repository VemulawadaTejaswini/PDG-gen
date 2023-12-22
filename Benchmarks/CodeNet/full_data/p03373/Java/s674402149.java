import java.util.*;
 
 
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int l = (x >= y) ? x:y;
        int s = (x < y) ? y:x;

        int min = Integer.MAX_VALUE;
        int sum;

        //単品
        sum = a*x + b*y;
        min = sum;

        //少ない方全部ハーフピザ＋残り単品
        if(x<=y) {
            sum = c*x*2 + b*(y-x);
        } else {
            sum = c*y*2 + a*(x-y);
        }
        min = sum<min ? sum:min;
        
        //多い方の全部ハーフピザ
        if(x>=y) {
            sum = c*x*2;
        } else {
            sum = c*y*2;
        }

        min = sum<min ? sum:min;

        System.out.println(min);
        

    }
}