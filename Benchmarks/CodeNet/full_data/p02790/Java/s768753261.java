import java.lang.Character.Subset;
import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        int b = scan.nextInt();
        int a_sum,b_sum;
        a_sum=0;
        b_sum=0;
        int tmp,j;
        for(int i=0;i<b;i++){
            a_sum*=10;
            a_sum+=a;
        }
        for(int i=0;i<a;i++){
            b_sum*=10;
            b_sum+=b;
        }
        System.out.println(Math.min(a_sum,b_sum));
    }
}