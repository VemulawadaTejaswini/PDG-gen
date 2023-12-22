import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long min = 0;
        for(int i = (int) Math.sqrt(n); i>0; --i){
                if(n%i==0){
                    min = n/i;
                    break;
                }
        }
        System.out.println(getNums(min));
    }
    static int getNums(long n){
        int count  = 0;
        while(n>0){
            n /= 10;
            count++;
        }
        return count;
    }
}