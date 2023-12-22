import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int X = stdIn.nextInt();

        int N_500 = 0;
        int N_5 = 0;

        int happy =0;

        N_500  = X / 500;
        N_5 = (X % 500) / 5;

        happy = 1000 * N_500 + 5 * N_5;

        System.out.print(happy);
        




        


    }

}