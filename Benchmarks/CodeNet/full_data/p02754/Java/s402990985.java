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
            count = count + a + b;
            if(count>n){
                count = count-a-b;
                break;
            }
            blue = blue + a;
        }

        if(count==n){
            System.out.println(blue);
            return;
        }
        
        for(long i=0; i<=a; i++){
            count += 1;
            if(count <= n){
                blue += 1;
            }else{
                System.out.println(blue);
                return;
            }
            count += b;
            if(count > n){
                System.out.println(blue);
                return;
            }
        }


    }
}