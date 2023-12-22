import java.lang.Character.Subset;
import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        int b = scan.nextInt();
        int a_sum,b_sum;
        a_sum=a;
        b_sum=b;
        int tmp,j;
        for(int i=0;i<b-1;i++){
            a_sum*=10;
            a_sum+=a;
        }
        for(int i=0;i<a-1;i++){
            b_sum*=10;
            b_sum+=b;
        }
        if(a>=b){
            System.out.println(b_sum);
        }
        else System.out.println(a_sum);
    }
}