import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] kane = new int[N];

        for(int i=0;i<N;i++){
            kane[i] = scan.nextInt();
        }

        Arrays.sort(kane);
        int y=0;
        y+=kane[N-1]/2;

        for(int i=0;i<N-1;i++){
            y+=kane[i];
        }

        System.out.println(y);

    }
}