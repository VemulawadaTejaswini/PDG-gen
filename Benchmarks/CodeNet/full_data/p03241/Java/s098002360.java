import java.util.Scanner;

public class Main4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(), M = in.nextInt();
        int max = M / N;
        int rst = 1;
        for(int i = max; i >= 1; i--){
            if(M % i == 0){
                rst = i;
                break;
            }
        }
        System.out.println(rst);
    }
}
