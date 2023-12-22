import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] beki = new int[33];
        for(int i=1; i<=32; i++){
            beki[i] = i*i;
            if(beki[i]>x){
                System.out.println(beki[i-1]);
                break;
            }else if(beki[i]==x){
                System.out.println(beki[i]);
                break;
            }
        }
    }

}
