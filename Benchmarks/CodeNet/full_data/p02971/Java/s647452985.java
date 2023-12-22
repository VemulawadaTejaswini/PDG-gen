import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int[] l = new int[N];
        int max = -1;
        int second_max = -1;
        for(int i = 0; i< N; i++){
            int num = Integer.parseInt(sc.next());
            if(num > max){
                second_max = max;
                max = num;
            }else{
                if(num > second_max){
                    second_max = num;
                }
            }
            l[i] = num;
        }
        for(int elem :l){
            if(max != elem){
                System.out.println(max);
            }else{
                System.out.println(second_max);
            }
        }
    }
}