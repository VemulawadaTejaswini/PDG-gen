import java.util.*;
import java.lang.Math;
import java.math.BigDecimal;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int[] array = new int[120000];
        for(int i = 0; i < 120000; i++){
            array[i] = 0;
        }
        array[0] = 1;
        for(int i = 2; i < 120000; i++){
            for(int j = 2; i * j < 120000; j++){
                array[i * j - 1] = 1;
            }
        }
        for(int i = target; i < 120000; i++){
            if(array[i - 1] == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
