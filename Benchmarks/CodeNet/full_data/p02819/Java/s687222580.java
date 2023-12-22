import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(;;x++){
            if(isPrime(x)) break;
        }
        System.out.println(x);
    }
    public static boolean isPrime(int x){
        if((x%2==0 && x!=2||x==1)) return false;
        for(int i=3; i<=Math.sqrt(x); i+=2){
            if(x % i == 0) return false;
        }
        return true;
    }
}