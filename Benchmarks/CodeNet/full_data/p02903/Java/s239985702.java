import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        for(int i = 0; i < H; i++){
            for(int j = 0; j < W; j++){
                if(j < A && i < B){
                    System.out.print(1);
                }else if(j >= A && i >= B){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}
