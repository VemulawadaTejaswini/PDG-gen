import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int A=scan.nextInt(),B=scan.nextInt(),C=scan.nextInt(),D=scan.nextInt();
        int minAB;
        int minCD;
        if(A <= B){
            minAB = A;
        }else{
            minAB = B;
        }
        if(C <= D){
            minCD = C;
        }else{
            minCD = D;
        }
        System.out.println(minAB + minCD);
    }
}