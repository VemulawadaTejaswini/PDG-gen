import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        long N = Integer.parseInt(input[0]);
        long M = Integer.parseInt(input[1]);
        long sum = 0;
        if( N == 1 || M == 1){
            sum = N * M - 2;
            if(sum < 0){
                sum *= -1;
            }
        }
        else{
            sum = (N-2) * (M-2);
        }
        System.out.println(sum);
    }
}
