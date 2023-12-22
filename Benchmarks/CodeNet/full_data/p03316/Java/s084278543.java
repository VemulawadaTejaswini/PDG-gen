import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N/10==0){
            System.out.println("Yes");
        } else {
            int D = N;
            int S = 0;
            while(D!=0){
                S+=D%10;
                D/=10;
            }
            if(N%S==0){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }