import java.util.Scanner;
import java.lang.Math;

class Main{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        scanner.close();

        long count = 0;
        long blue = 0;
        
        for(long i = 0; i<Math.pow(10,100); i++){
            count += a;
            if(count<=n){
                blue += a;
            }else{
                for(long j=0; j<a; j++){
                    blue += 1;
                    count = count+1-a;
                    if(count == n){
                        System.out.println(blue);
                        return;
                    }
                }
            }
            count += b;
            if(count>n){
                System.out.println(blue);
                return;
            }
        }
    }
}