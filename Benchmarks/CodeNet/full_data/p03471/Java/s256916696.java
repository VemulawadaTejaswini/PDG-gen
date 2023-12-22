import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());

        int total = 0;
        int resa=-1;
        int resb=-1;
        int resc=-1;
        for(int a=0;a<=n;a++){
            for(int b=0;b+a<=n;b++){
                int c = n-(a+b);
                total = a*10000 + b*5000 + c*1000;
                if(total==y){
                    resa=a;
                    resb=b;
                    resc=c;
                }
            }
        }
        System.out.println(String.format("%d %d %d", resa, resb, resc));
    }
}