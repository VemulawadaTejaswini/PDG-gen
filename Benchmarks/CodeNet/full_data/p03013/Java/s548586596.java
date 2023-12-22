import java.util.Scanner;
import java.util.ArrayList;



public class Main{
    private static int fib(int a){
        if(a == 0) return 0;
        if(a == 1) return 1;
        return fib(a-2) + fib(a-1);
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int temp = 0;
        int kekka = 1;
        ArrayList<Integer> Array = new ArrayList<Integer>();

        for(int i = 0; i<num2;i++){
            int num3 = scan.nextInt();
            Array.add(num3);
        }
        for(int i = 0; i<num2-1;i++){
            if(Array.get(i+1) - Array.get(i) == 1){
                System.out.println(0);
                return;
            }
        }

        for(int i = 0; i<Array.size();i++){
            kekka *= (fib(Array.get(i) - temp)) % 1000000007;
            temp = Array.get(i); 
        }
        kekka *= fib(num1 - temp);
        kekka %= 1000000007;
        System.out.println(kekka);

        


    }
}