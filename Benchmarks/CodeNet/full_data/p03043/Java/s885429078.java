import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        double K = sc.nextDouble();
        double Ans= 0.0;
        for(double i=1.0; i<=N;i++){Ans += 1/((i < K) ? Math.pow(2,Math.ceil(Math.log(K/i)/Math.log(2.0))) : 1.0);}
        Ans /= N;
        System.out.println(Ans);
        sc.close();
    }
}