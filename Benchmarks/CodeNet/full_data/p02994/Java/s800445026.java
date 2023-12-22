import java.util.Scanner;

public final class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int l = stdIn.nextInt();

        if(l<=0 && 0<=l+n-1){
            System.out.println(n*l+(n*(n-1))/2);
        }else if(0<l){
            System.out.println((n-1)*l+(n*(n-1))/2);            
        }else{
            System.out.println((n-1)*l+(n*(n-1))/2-n+1);
        }
    }
}