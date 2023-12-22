import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3,sum=0;
        ArrayList<Integer> Array = new ArrayList<Integer>();
        for(int i = 0; i<num1;i++){
            num3 = scan.nextInt();
            Array.add(num3);   
        }

        for(int i = 0; i<num2; i++){
            num3 = scan.nextInt();
            num1 = scan.nextInt();
            Collections.sort(Array);
            for(int j = 0; j<num3 ; j++){
                if( Array.get(j) < num1 ){
                    Array.set(j,num1);
                } 
            }

        }
        for(int temp: Array){
            sum += temp;
        }
        System.out.println(sum);
    }
}