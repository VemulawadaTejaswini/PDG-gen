import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int M;
        int a = N/3;
        int b = N/5;
        int c = N/15;
        M = (1+N)*N/2
        -a*(a*3+3)/2
        -b*(b*5+5)/2
        +c*(c*15+15)/2;

        System.out.print(M);
    }
}
