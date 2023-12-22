import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        int x = scan.nextInt();
        int[] p = {100, 101, 102, 103, 104, 105};
        int sum = 0;
        for(int i = 0; i < (1 << 6); i++){
            for(int j = 0; j < 6; j++){
                sum += 100 + j;
            }
            if(x % sum == 0){
                System.out.println(1);
                return;
            }
            sum = 0;
        }
        System.out.println(0);
        scan.close();
    }
}