import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int k = scan.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < length; i++){
            numbers[i] = scan.nextInt();
        }
        int[] result = new int[length];
        for (int i = 0; i < length; i++){
            result[i] = 999999999;
        }
        result[0] = 0;
        for (int i = 0; i < length; i++){
            for (int j = 1; j <= k; j++){
                if (i + j < length) result[i + j] = Math.min(result[i + j],result[i] + (int)Math.abs(numbers[i] - numbers[i+j]));
            }
        }
        System.out.println(result[length -1]);
        
        scan.close();
    }
}