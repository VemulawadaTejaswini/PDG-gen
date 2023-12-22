import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int res=0;
        while(n>0)
        {
            n/=k;
            res++;
        }
        System.out.println(res);
    }
}