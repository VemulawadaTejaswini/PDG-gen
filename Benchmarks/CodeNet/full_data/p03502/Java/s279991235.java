import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int N=scan.nextInt();
        int copy=N;
        int sum_order=0;
        int i=1,j=10;
        while(N%i!=N){
            i*=10;
            sum_order+=copy%j;
            copy/=10;
            //System.out.println(sum_order);
        }
        if(N%sum_order==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}