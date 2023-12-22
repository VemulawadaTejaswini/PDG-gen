import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();

        double m = L/3.0;
        System.out.println(String.format("%f",m*m*m));
    }
}