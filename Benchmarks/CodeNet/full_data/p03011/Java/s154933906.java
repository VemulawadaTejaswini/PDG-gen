import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int[] distance = new int[3];
        for(int i = 0; i < 3; i++){
            distance[i] = scan.nextInt();
        }        

        // answer
        Arrays.sort(distance);
        System.out.println(distance[0] + distance[1]);

    }
}