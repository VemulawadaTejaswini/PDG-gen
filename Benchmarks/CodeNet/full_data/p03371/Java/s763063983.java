import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int c = sc.nextInt();
       int x = sc.nextInt();
       int y = sc.nextInt();

       long i = a * x + b * y;
       long ii = c*2 * Math.max(x, y);
       long iii = 0;
       if(x > y){
        iii = c*2 * y + a * (x - y);
       }else{
        iii = c*2 * x + b * (y - x);
       }

       System.out.println(Math.min(Math.min(i, ii), iii));
    }
}