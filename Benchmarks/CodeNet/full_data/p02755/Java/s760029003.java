import java.util.*;
import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        int a, b, c = 0;
        int result = 0;
        double flag1, flag2, flag3, flag4;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        flag1 = a / 0.08;
        flag2 = (a + 1) / 0.08;
        flag3 = b / 0.1;
        flag4 = (b + 1) / 0.1;
        //System.out.println(Math.floor(flag4));
        for(double i = Math.floor(flag3); i <Math.floor(flag4); i++){
            for(double j = Math.floor(flag1); i <Math.floor(flag2); i++){
                if(j == i){
                   result = 1;
                    c = (int)i;
                    break;
                }
                if(result == 1){
                    break;
                }
            }
       }
       if(result == 1){
        System.out.println(c); 
       }else{
        System.out.println(-1); 
       }
    }
}