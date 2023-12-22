import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int R = stdIn.nextInt();
        double pie = 3.141952;
        double L = 0.0;
        L = 2 * pie * (double)R;
        System.out.print(L);

    }
} 