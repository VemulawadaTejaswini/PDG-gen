import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N,M = INteger.valueOf((scn.nextLine()).split(" "));
        int[] Am = new int[M];
        Am = INteger.valueOf((scn.nextLine()).split(" "));
        int sum = 0;
        int result = 0;
        for(int i=0;i<M;i++){
            sum += Am[i];
        }
        if(N > sum){
            result = N -sum;
        }else{
            result = -1;
        }
        System.out.println(result);

    }
}