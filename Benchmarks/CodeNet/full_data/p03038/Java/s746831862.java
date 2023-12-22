import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3,k,temp,sum=0;
        ArrayList<Integer> Array = new ArrayList<Integer>();
        for(int i = 0; i<num1;i++){
            num3 = scan.nextInt();
            Array.add(num3);   
        }

        Collections.sort(Array);

        for(int i = 0; i<num2; i++){
            num3 = scan.nextInt();
            num1 = scan.nextInt();
            for(int j = 0; j<num3; j++){
                if(Array.get(0) >= num1)    continue;
                else{
                    Array.set(0,num1);
                    k = 0;
                    while(Array.get(k) > Array.get(k+1)){
                        temp = Array.get(k);
                        Array.set(k,Array.get(k+1));
                        Array.set(k+1,temp);
                        k++;
                    }
                    System.out.println(Array);
                }
            }
        }
        for(int temp1: Array){
            sum += temp1;
        }
        System.out.println(sum);
    }
}