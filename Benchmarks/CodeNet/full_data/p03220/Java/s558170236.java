import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double N=sc.nextInt();
        double T=sc.nextInt();
        double A=sc.nextInt();
        int opt_h=1;
        double H=sc.nextInt();
        double t = T-H*0.006;
        double opt = Math.abs(A-t);

        for(int a=1;a<N;a++){
             H=sc.nextInt();
            t = T-H*0.006;
            double h = Math.abs(A-t);
            if(h<=opt){
                opt=h;
                opt_h=a+1;
            }
        }
        System.out.println(opt_h);
    }
}
