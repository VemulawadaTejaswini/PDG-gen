import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n,con,sum;
        con=1;
        sum=0;
        n=scan.nextInt();
        for(int i=0;i<n;i++){
            if(con==scan.nextInt()){
                con+=1;
            }
            else sum+=1;
        }
        System.out.println(sum);
    }
}