import java.util.*;
import java.lang.*;
import java.io.*;

class frog{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++){
            numbers[i] = scan.nextInt();
        }
        int[] result = new int[length];
        
        if (length < 3){
            System.out.println( numbers[1] - numbers[0]);
        }
        else{
            result[0] = 0;
            result[1] = (int)Math.abs(numbers[1] - numbers[0]);
            for (int i = 2; i < length; i++){
                result[i] = Math.min(result[i - 1] + (int)Math.abs(numbers[i] - numbers[i -1]),result[i - 2] + (int)Math.abs(numbers[i] - numbers[i - 2]));
            }
            System.out.println(result[length -1]);
        }
        scan.close();
    }
}