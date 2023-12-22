import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int hoge = sc.nextInt();
        int[] array = new int[hoge];
        int sum = 0;
        for(int i = 0; i < hoge; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0; i < hoge; i++){
            for(int j = i + 1; j < hoge; j++){
                sum += array[i] * array[j];
            }
        }
        System.out.println(sum);
    }   
}