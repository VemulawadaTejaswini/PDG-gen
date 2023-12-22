import java.util.*;
import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        int n, a, b;
        int result = 0;
        int flag1 = 0, flag2 = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        for(int i =0; i < n; i++){
            if( flag1 < a){
                result++;
                flag1++;
                flag2 = 0;
            }else{
                flag2++;
                flag1 = 0;
            }
        }
        System.out.println(result);
    }
}