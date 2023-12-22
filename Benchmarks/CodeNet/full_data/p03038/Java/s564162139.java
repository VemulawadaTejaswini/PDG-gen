import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3;
        ArrayList<Integer> Array = new ArrayList<Integer>();
        for(int i = 0; i<num1;i++){
            num3 = scan.nextInt();
            Array.add(num3);   
        }

        for(int i = 0; i<num2; i++){
            num3 = scan.nextInt();
            num1 = scan.nextInt();
            
            for(int j = 0; j<num3 ; j++){
                if(Collections.min(Array) < num1){
                    Collections.sort(Array);
                    Array.set(0,num1);
                }
            }
        }
        System.out.println(Array);
    }
}